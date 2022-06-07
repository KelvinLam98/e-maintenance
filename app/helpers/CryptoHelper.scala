package helpers

import java.nio.ByteBuffer
import java.security.MessageDigest
import models.User
import org.apache.commons.lang.RandomStringUtils
import org.apache.commons.codec.digest.DigestUtils

import math.random
import pdi.jwt.{JwtAlgorithm, JwtJson}
import play.api.libs.json.{JsObject, Json}

import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.{IvParameterSpec, PBEKeySpec, SecretKeySpec}

object CryptoHelper {

  def md5(input: String): String = {
    val digest = MessageDigest.getInstance("MD5").digest(input.getBytes("utf-8"))
    (digest.map { c =>
      Integer.toHexString((c & 0xFF) | 0x100).substring(1,3)
    }).mkString
  }

  def sha256(input: String): String = {
    val digest = MessageDigest.getInstance("SHA-256").digest(input.getBytes("utf-8"))
    (digest.map { c =>
      Integer.toHexString((c & 0xFF) | 0x100).substring(1,3)
    }).mkString
  }

  def sha512(input: String): String = {
    val digest = MessageDigest.getInstance("SHA-512").digest(input.getBytes("utf-8"))
    (digest.map { c =>
      Integer.toHexString((c & 0xFF) | 0x100).substring(1,3)
    }).mkString
  }

  def userIdHash(input: String): Long = {
    val digest = MessageDigest.getInstance("SHA-512").digest(input.getBytes("utf-8"))
    ByteBuffer.wrap(digest).getLong()
  }

  def generateHardToGuessString(strArr: String*): String = {
    val joinStr = strArr.mkString
    val frontStr = RandomStringUtils.random(16)
    val backStr = RandomStringUtils.random(16)

    DigestUtils.shaHex((frontStr + joinStr + backStr + random()).getBytes("UTF-8"))
  }

  val jwtAlgo = JwtAlgorithm.HS256
  val jwtSecret = "testingtesting"
  val readOnlyJwtSecret = "readtestingonly"

  def encodeJWT(user: User): String = {
    val json = Json.toJson(user).as[JsObject]
    JwtJson.encode(json, jwtSecret, jwtAlgo)
  }

  def decodeJWT(token: String): Option[User] = {
    JwtJson.decodeJson(token, jwtSecret, Vector(jwtAlgo)).map(jsObj => jsObj.validate[User].get).toOption
  }

  def encodeReadOnlyJWT(user: User): String = {
    val json = Json.toJson(user).as[JsObject]
    JwtJson.encode(json, readOnlyJwtSecret, jwtAlgo)
  }

  def decodeReadOnlyJWT(token: String): Option[User] = {
    JwtJson.decodeJson(token, readOnlyJwtSecret, Vector(jwtAlgo)).map(jsObj => jsObj.validate[User].get).toOption
  }

  /**
   * Generates the SecretKeySpec, given the private key and the algorithm.
   */
  private def secretKeyWithSha256(privateKey: String, algorithm: String) = {
    val messageDigest = MessageDigest.getInstance("SHA-256")
    messageDigest.update(privateKey.getBytes("utf-8"))
    // max allowed length in bits / (8 bits to a byte)
    val maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength(algorithm) / 8
    val raw = messageDigest.digest().slice(0, maxAllowedKeyLength)
    new SecretKeySpec(raw, algorithm)
  }

  def encryptAES(value: String, privateKey: String): String = {
    val skeySpec = secretKeyWithSha256(privateKey, "AES")
    val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(Array[Byte](0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)))
    val encryptedValue = cipher.doFinal(value.getBytes("utf-8"))
    Base64.getEncoder.encodeToString(encryptedValue)
  }

  def decryptAES(value: String, privateKey: String): String = {
    val data = Base64.getDecoder.decode(value)
    val skeySpec = secretKeyWithSha256(privateKey, "AES")
    val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
    cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(Array[Byte](0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)))
    new String(cipher.doFinal(data), "utf-8")
  }

}

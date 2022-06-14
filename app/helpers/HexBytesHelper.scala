package helpers

class HexBytesHelper {

  def hex2bytes(hex: String): Array[Byte] = {
    if(hex.contains(" ")){
      hex.split(" ").map(Integer.parseInt(_, 16).toByte)
    } else if(hex.contains("-")){
      hex.split("-").map(Integer.parseInt(_, 16).toByte)
    } else {
      hex.toSeq.sliding(2,2).map(_.unwrap).toArray.map(Integer.parseInt(_, 16).toByte)
    }
  }

  def bytes2hex(bytes: Array[Byte], sep: Option[String] = None): String = {
    sep match {
      case None =>  bytes.map("%02x".format(_)).mkString
      case _ =>  bytes.map("%02x".format(_)).mkString(sep.get)
    }
  }

}
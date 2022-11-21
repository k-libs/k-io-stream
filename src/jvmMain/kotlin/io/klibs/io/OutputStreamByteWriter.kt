package io.klibs.io

import java.io.OutputStream

inline fun OutputStream.toByteWriter(): ByteWriter = OutputStreamByteWriter(this)

class OutputStreamByteWriter(private val outputStream: OutputStream) : ByteWriter {
  override fun write(buffer: ByteArray, offset: Int, len: Int) {
    outputStream.write(buffer, offset, len)
  }
}
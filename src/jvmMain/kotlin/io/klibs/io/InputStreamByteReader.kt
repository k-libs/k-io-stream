package io.klibs.io

import java.io.InputStream

inline fun InputStream.toByteReader(): ByteReader = InputStreamByteReader(this)

class InputStreamByteReader(private val inputStream: InputStream) : ByteReader {
  override fun read(buffer: ByteArray, offset: Int, max: Int): Int {
    return inputStream.read(buffer, offset, max)
  }
}
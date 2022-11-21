package io.klibs.io

/**
 * # Byte Writer
 *
 * Defines a low-level stream writer that writes bytes from the given buffer out
 * to the stream.
 *
 * @author Elizabeth Paige Harper - https://github.com/foxcapades
 * @since 1.0.0
 */
interface ByteWriter {

  /**
   * Writes bytes to the stream from the given [buffer] starting at the given
   * [offset] position for a maximum of [len] bytes.
   *
   * @param buffer Byte buffer from which bytes will be read to be written to
   * the stream.
   *
   * @param offset Offset in the byte buffer to start reading bytes from.
   *
   * The first value written to the stream will be read from `buffer[offset]`,
   * the second from `buffer[offset+1]`, and so on.
   *
   * If `offset` is less than `0` or is greater than or equal to `buffer.size`,
   * an [IllegalArgumentException] will be thrown.
   *
   * Default: `0`
   *
   * @param len Length of the readable segment of the given buffer.
   *
   * If `len` equals `0`, then no bytes will be copied from the buffer to
   * the stream.
   *
   * If `len` is less than `0` or is greater than `buffer.size - offset`, an
   * [IllegalArgumentException] will be thrown.
   *
   * Default: `buffer.size - offset`
   */
  @Throws(IllegalArgumentException::class)
  fun write(buffer: ByteArray, offset: Int = 0, len: Int = buffer.size - offset)
}

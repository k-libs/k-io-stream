package io.klibs.io

/**
 * # Byte Reader
 *
 * Defines a low-level stream reader that fills a given buffer with bytes read
 * from the stream.
 *
 * @author Elizabeth Paige Harper - https://github.com/foxcapades
 * @since 1.0.0
 */
interface ByteReader {

  /**
   * Reads bytes from the stream into the given [buffer] starting at the given
   * [offset] position for a maximum of [max] bytes.
   *
   * If `offset` is less than `1`, no bytes will be read from the stream.
   *
   * If `max` is less than `1`, no bytes will be read from the stream.
   *
   * If `offset + max` is greater than `buffer.size`, at most
   * `buffer.size - offset` read from the stream.
   *
   * @param buffer Byte buffer that will be filled with bytes from the
   * underlying stream.
   *
   * If this buffer has a size of `0`, no bytes will be read.
   *
   * @param offset Offset position that should be used as the starting point
   * when writing bytes into the given buffer.
   *
   * The first byte read from the stream will be written to `buffer[offset]`,
   * the second to `buffer[offset+1]`, and so on.
   *
   * If this value is less than `0` or g
   *
   * Default: `0`
   *
   * @param max Max number of bytes to read from the underlying stream.
   *
   * Default: `buffer.size - offset`
   *
   * @return The number of bytes read from the underlying stream or `-1` if the
   * end of the stream has already been reached.
   */
  fun read(buffer: ByteArray, offset: Int = 0, max: Int = buffer.size - offset): Int
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4 = "LZ4".nativeClass(Module.LZ4, prefix = "LZ4", prefixMethod = "LZ4_", library = LZ4_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4_STATIC_LINKING_ONLY
#include "lz4.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to ${url("http://lz4.github.io/lz4/", "LZ4")}, a lossless compression algorithm, providing compression speed at 400 MB/s per core,
        scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
        multi-core systems.

        Speed can be tuned dynamically, selecting an "acceleration" factor which trades compression ratio for more speed up. On the other end, a high
        compression derivative, {@code LZ4_HC}, is also provided, trading CPU time for improved compression ratio. All versions feature the same decompression
        speed.

        The raw LZ4 block compression format is detailed within <a href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Block_format.md">lz4_Block_format</a>.

        To compress an arbitrarily long file or data stream, multiple blocks are required. Organizing these blocks and providing a common header format to
        handle their content is the purpose of the Frame format, defined into
        <a href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Frame_format.md">lz4_Frame_format</a>. Interoperable versions of LZ4 must respect this frame
        format.
        """

    IntConstant(
        "Version number part.",

        "VERSION_MAJOR".."1",
        "VERSION_MINOR".."8",
        "VERSION_RELEASE".."2"
    )

    IntConstant("Version number.", "VERSION_NUMBER".."(LZ4_VERSION_MAJOR *100*100 + LZ4_VERSION_MINOR *100 + LZ4_VERSION_RELEASE)")
    StringConstant("Version string.", "VERSION_STRING".."""LZ4_VERSION_MAJOR + "." + LZ4_VERSION_MINOR + "." + LZ4_VERSION_RELEASE""")

    int("versionNumber", "Returns the version number.")
    Nonnull..charASCII.const.p("versionString", "Returns the version string.")

    IntConstant(
        "Maximum input size.",

        "MAX_INPUT_SIZE"..0x7E000000
    )

    IntConstant(
        """
        Memory usage formula : {@code N->2^N} Bytes (examples: {@code 10 -> 1KB; 12 -> 4KB ; 16 -> 64KB; 20 -> 1MB;} etc.)

        Increasing memory usage improves compression ratio. Reduced memory usage can improve speed, due to cache effect. Default value is 14, for 16KB, which
        nicely fits into Intel x86 L1 cache.
        """,
        "MEMORY_USAGE".."14"
    )

    IntConstant("", "HASHLOG".."(LZ4_MEMORY_USAGE - 2)")
    IntConstant("", "HASHTABLESIZE".."(1 << LZ4_MEMORY_USAGE)")
    IntConstant("", "HASH_SIZE_U32".."(1 << LZ4_HASHLOG)")

    IntConstant("", "STREAMSIZE_U64".."((1 << (LZ4_MEMORY_USAGE-3)) + 4)")
    IntConstant("", "STREAMSIZE".."(LZ4_STREAMSIZE_U64 * Long.BYTES)")

    IntConstant("", "STREAMDECODESIZE_U64".."4")
    IntConstant("", "STREAMDECODESIZE".."(LZ4_STREAMDECODESIZE_U64 * Long.BYTES)")

    int(
        "compress_default",
        """
        Compresses {@code srcSize} bytes from buffer {@code src} into already allocated {@code dst} buffer of size {@code dstCapacity}.

        Compression is guaranteed to succeed if {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}. It also runs faster, so it's a recommended setting.

        If the function cannot compress {@code src} into a more limited {@code dst} budget, compression stops <i>immediately</i>, and the function result is
        zero. As a consequence, {@code dst} content is not valid.

        This function is protected against buffer overflow scenarios (never writes outside {@code dst} buffer, nor read outside {@code src} buffer).
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", "max supported value is #MAX_INPUT_SIZE"),
        AutoSize("dst")..int.IN("dstCapacity", "size of buffer {@code dst} (which must be already allocated)"),

        returnDoc = "the number of bytes written into buffer {@code dest} (necessarily &le; {@code maxOutputSize}) or 0 if compression fails"
    )

    int(
        "decompress_safe",
        """
        If destination buffer is not large enough, decoding will stop and output an error code (negative value).

        If the source stream is detected malformed, the function will stop decoding and return a negative result.

        This function is protected against malicious data packets.
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("compressedSize", "is the exact complete size of the compressed block"),
        AutoSize("dst")..int.IN("dstCapacity", "is the size of destination buffer, which must be already allocated"),

        returnDoc = "the number of bytes decompressed into destination buffer (necessarily &le; {@code dstCapacity})"
    )

    macro(expression = "LZ4_MAX_INPUT_SIZE < isize ? 0 : isize + isize / 255 + 16")..int(
        "COMPRESSBOUND",
        "See #compressBound().",

        int.IN("isize", "")
    )

    int(
        "compressBound",
        """
        Provides the maximum size that LZ4 compression may output in a "worst case" scenario (input data not compressible).

        This function is primarily useful for memory allocation purposes (destination buffer size). Macro #COMPRESSBOUND() is also provided for
        compilation-time evaluation (stack memory allocation for example).

        Note that #compress_default() compresses faster when {@code dstCapacity} is &ge; #compressBound(){@code (srcSize)}
        """,

        int.IN("inputSize", "max supported value is #MAX_INPUT_SIZE"),

        returnDoc = "maximum output size in a \"worst case\" scenario or 0, if input size is incorrect (too large or negative)"
    )

    int(
        "compress_fast",
        """
        Same as #compress_default(), but allows selection of "acceleration" factor.

        The larger the acceleration value, the faster the algorithm, but also the lesser the compression. It's a trade-off. It can be fine tuned, with each
        successive value providing roughly +~3% to speed. An acceleration value of "1" is the same as regular #compress_default(). Values &le; 0 will be
        replaced by {@code ACCELERATION_DEFAULT} (currently == 1, see lz4.c).
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        int.IN("acceleration", "")
    )

    int(
        "sizeofState",
        ""
    )

    int(
        "compress_fast_extState",
        """
        Same as #compress_fast(), just using an externally allocated memory space to store compression state.

        Use #sizeofState() to know how much memory must be allocated, and allocate it on 8-bytes boundaries (using {@code malloc()} typically). Then, provide
        it as {@code void* state} to compression function.
        """,

        Unsafe..void.p.OUT("state", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        int.IN("acceleration", "")
    )

    int(
        "compress_destSize",
        """
        Reverse the logic: compresses as much data as possible from {@code src} buffer into already allocated buffer {@code dst} of size
        {@code targetDstSize}.

        This function either compresses the entire {@code src} content into {@code dst} if it's large enough, or fill {@code dst} buffer completely with as
        much data as possible from {@code src}.
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..Check(1)..int.p.INOUT(
            "srcSizePtr",
            "will be modified to indicate how many bytes where read from {@code source} to fill {@code dest}. New value is necessarily &le; old value."
        ),
        AutoSize("dst")..int.IN("targetDstSize", ""),

        returnDoc = "nb bytes written into {@code dest} (necessarily &le; {@code targetDestSize}) or 0 if compression fails"
    )

    int(
        "decompress_fast",
        """
        This function is a bit faster than #decompress_safe(), but doesn't provide any security guarantee.

        This function respects memory boundaries for <i>properly formed</i> compressed data. However, it does not provide any protection against malicious
        input. It also doesn't know {@code src} size, and implies it's &ge; compressed size. Use this function in trusted environment <b>only</b>.
        """,

        Unsafe..char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("dst")..int.IN(
            "originalSize",
            "is the uncompressed size to regenerate. Destination buffer must be already allocated, and its size must be &ge; {@code originalSize} bytes."),

        returnDoc =
        """
        the number of bytes read from the source buffer (== the compressed size). If the source stream is detected malformed, the function stops decoding and
        return a negative result. Destination buffer must be already allocated. Its size must be &ge; {@code originalSize} bytes.
        """
    )

    int(
        "decompress_safe_partial",
        """
        This function decompress a compressed block of size {@code compressedSize} at position {@code src} into destination buffer {@code dst} of size
        {@code dstCapacity}.

        The function will decompress a minimum of {@code targetOutputSize} bytes, and stop after that. However, it's not accurate, and may write more than
        {@code targetOutputSize} (but always &le; {@code dstCapacity}).

        This function never writes outside of output buffer, and never reads outside of input buffer. It is therefore protected against malicious data packets.
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("compressedSize", ""),
        int.IN("targetOutputSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),

        returnDoc =
        """
        the number of bytes decoded in the destination buffer (necessarily &le; {@code dstCapacity})

        Note: this number can also be &lt; {@code targetOutputSize}, if compressed block contains less data. Therefore, always control how many bytes were
        decoded. If source stream is detected malformed, function returns a negative result. This function is protected against malicious data packets.
        """
    )

    LZ4_stream_t.p(
        "createStream",
        "Allocates and initializes an {@code LZ4_stream_t} structure."
    )

    int(
        "freeStream",
        "Releases memory of an {@code LZ4_stream_t} structure.",

        LZ4_stream_t.p.IN("streamPtr", "")
    )

    void(
        "resetStream",
        "An {@code LZ4_stream_t} structure can be allocated once and re-used multiple times. Use this function to start compressing a new stream.",

        LZ4_stream_t.p.IN("streamPtr", "")
    )

    int(
        "loadDict",
        """
        Use this function to load a static dictionary into {@code LZ4_stream_t}.

        Any previous data will be forgotten, only {@code dictionary} will remain in memory. Loading a size of 0 is allowed, and is the same as reset.
        """,

        LZ4_stream_t.p.IN("streamPtr", ""),
        nullable..char.const.p.IN("dictionary", ""),
        AutoSize("dictionary")..int.IN("dictSize", "")
    )

    int(
        "compress_fast_continue",
        """
        Compress {@code src} content using data from previously compressed blocks, for better compression ratio.

        {@code dst} buffer must be already allocated. If {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}, compression is guaranteed to succeed, and
        runs faster.

        Important: The previous 64KB of compressed data is assumed to remain present and unmodified in memory! If less than 64KB has been compressed all the
        data must be present.

        Special:
        ${ol(
            """
            When input is a double-buffer, they can have any size, including &lt; 64 KB. Make sure that buffers are separated by at least one byte. This way,
            each block only depends on previous block.
            """,
            "If input buffer is a ring-buffer, it can have any size, including &lt; 64 KB."
        )}
        """,

        LZ4_stream_t.p.IN("streamPtr", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        int.IN("acceleration", ""),

        returnDoc =
        """
        size of compressed block or 0 if there is an error (typically, cannot fit into {@code dst}). After an error, the stream status is invalid, it can only
        be reset or freed.
        """
    )

    int(
        "saveDict",
        """
        If last 64KB data cannot be guaranteed to remain available at its current memory location, save it into a safer place ({@code char* safeBuffer}).

        This is schematically equivalent to a {@code memcpy()} followed by #loadDict(), but is much faster, because {@code LZ4_saveDict()} doesn't need to
        rebuild tables.
        """,

        LZ4_stream_t.p.IN("streamPtr", ""),
        char.p.OUT("safeBuffer", ""),
        AutoSize("safeBuffer")..int.IN("maxDictSize", ""),

        returnDoc = "saved dictionary size in bytes (necessarily &le; {@code maxDictSize}), or 0 if error"
    )

    LZ4_streamDecode_t.p(
        "createStreamDecode",
        """
        Creates a streaming decompression tracking structure.

        A tracking structure can be re-used multiple times sequentially.
        """
    )

    int(
        "freeStreamDecode",
        "Frees a streaming decompression tracking structure.",

        LZ4_streamDecode_t.p.IN("LZ4_stream", "")
    )

    intb(
        "setStreamDecode",
        """
        An {@code LZ4_streamDecode_t} structure can be allocated once and re-used multiple times. Use this function to start decompression of a new stream of
        blocks.

        A dictionary can optionnally be set. Use #NULL or size 0 for a reset order.
        """,

        LZ4_streamDecode_t.p.IN("LZ4_streamDecode", ""),
        char.const.p.IN("dictionary", ""),
        AutoSize("dictionary")..int.IN("dictSize", ""),

        returnDoc = "1 if OK, 0 if error"
    )

    int(
        "decompress_safe_continue",
        """
        These decoding functions allow decompression of consecutive blocks in "streaming" mode.

        A block is an unsplittable entity, it must be presented entirely to a decompression function. Decompression functions only accept one block at a time.
        The last 64KB of previously decoded data <i>must</i> remain available and unmodified at the memory position where they were decoded. If less than 64KB
        of data has been decoded all the data must be present.

        Special: if application sets a ring buffer for decompression, it must respect one of the following conditions:
        ${ul(
            """
            Exactly same size as encoding buffer, with same update rule (block boundaries at same positions) In which case, the decoding &amp; encoding ring
            buffer can have any size, including very small ones ( &lt; 64 KB).
            """,
            """
            Larger than encoding buffer, by a minimum of {@code maxBlockSize} more bytes.

            {@code maxBlockSize} is implementation dependent. It's the maximum size of any single block. In which case, encoding and decoding buffers do not
            need to be synchronized, and encoding ring buffer can have any size, including small ones ( &lt; 64 KB).
            """,
            """
            <i>At least</i> {@code 64 KB + 8 bytes + maxBlockSize}.

            In which case, encoding and decoding buffers do not need to be synchronized, and encoding ring buffer can have any size, including larger than
            decoding buffer.
            """
        )}
        Whenever these conditions are not possible, save the last 64KB of decoded data into a safe buffer, and indicate where it is saved using
        #setStreamDecode() before decompressing next block.
        """,

        LZ4_streamDecode_t.p.IN("LZ4_streamDecode", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", "")
    )

    int(
        "decompress_fast_continue",
        "See #decompress_safe_continue().",

        LZ4_streamDecode_t.p.IN("LZ4_streamDecode", ""),
        Unsafe..char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("dst")..int.IN("originalSize", "")
    )

    int(
        "decompress_safe_usingDict",
        """
        These decoding functions work the same as a combination of #setStreamDecode() followed by {@code LZ4_decompress_*_continue()}. They are stand-alone,
        and don't need an {@code LZ4_streamDecode_t} structure.
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        char.const.p.IN("dictStart", ""),
        AutoSize("dictStart")..int.IN("dictSize", "")
    )

    int(
        "decompress_fast_usingDict",
        "See {@code decompress_safe_usingDict}.",

        Unsafe..char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("dst")..int.IN("originalSize", ""),
        char.const.p.IN("dictStart", ""),
        AutoSize("dictStart")..int.IN("dictSize", "")
    )

    void(
        "resetStream_fast",
        """
        When an {@code LZ4_stream_t} is known to be in a internally coherent state, it can often be prepared for a new compression with almost no work, only
        sometimes falling back to the full, expensive reset that is always required when the stream is in an indeterminate state (i.e., the reset performed b
        #resetStream()).

        {@code LZ4_streams} are guaranteed to be in a valid state when:
        ${ul(
            "returned from #createStream()",
            "reset by #resetStream()",
            "{@code memset(stream, 0, sizeof(LZ4_stream_t))}",
            "the stream was in a valid state and was reset by #resetStream_fast()",
            "the stream was in a valid state and was then used in any compression call that returned success",
            """
            the stream was in an indeterminate state and was used in a compression call that fully reset the state (#compress_fast_extState()) and that
            returned success
            """
        )}
        """,

        LZ4_stream_t.p.OUT("streamPtr", "")
    )

    int(
        "compress_fast_extState_fastReset",
        """
        A variant of #compress_fast_extState().

        Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
        (see above comment on #resetStream_fast() for a definition of "correctly initialized"). From a high level, the difference is that this function
        initializes the provided state with a call to #resetStream_fast() while #compress_fast_extState() starts with a call to #resetStream().
        """,

        Unsafe..void.p.OUT("state", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        int.IN("acceleration", "")
    )

    void(
        "attach_dictionary",
        """
        This is an experimental API that allows for the efficient use of a static dictionary many times.

        Rather than re-loading the dictionary buffer into a working context before each compression, or copying a pre-loaded dictionary's {@code LZ4_stream_t}
        into a working {@code LZ4_stream_t}, this function introduces a no-copy setup mechanism, in which the working stream references the dictionary stream
        in-place.

        Several assumptions are made about the state of the dictionary stream. Currently, only streams which have been prepared by #loadDict() should be
        expected to work.

        Alternatively, the provided dictionary stream pointer may be #NULL, in which case any existing dictionary stream is unset.

        If a dictionary is provided, it replaces any pre-existing stream history. The dictionary contents are the only history that can be referenced and
        logically immediately precede the data compressed in the first subsequent compression call.

        The dictionary will only remain attached to the working stream through the first compression call, at the end of which it is cleared. The dictionary
        stream (and source buffer) must remain in-place / accessible / unchanged through the completion of the first compression call on the stream.
        """,

        LZ4_stream_t.p.OUT("working_stream", ""),
        nullable..LZ4_stream_t.const.p.IN("dictionary_stream", "")
    )
}
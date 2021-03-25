/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4 = "LZ4".nativeClass(Module.LZ4, prefix = "LZ4", prefixMethod = "LZ4_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4_STATIC_LINKING_ONLY
#include "lz4.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to ${url("http://lz4.github.io/lz4/", "LZ4")}, a lossless compression algorithm, providing compression speed &gt; 500 MB/s per core,
        scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
        multi-core systems.

        Speed can be tuned dynamically, selecting an "acceleration" factor which trades compression ratio for faster speed. On the other end, a high
        compression derivative, {@code LZ4_HC}, is also provided, trading CPU time for improved compression ratio. All versions feature the same decompression
        speed.

        LZ4 is also compatible with ${url("https://github.com/facebook/zstd\\#the-case-for-small-data-compression", "dictionary compression")}, and can ingest
        any input file as dictionary, including those created by ${url("https://github.com/facebook/zstd/blob/v1.3.5/programs/zstd.1.md\\#dictionary-builder",
        "Zstandard Dictionary Builder")}. (note: only the final 64KB are used).

        The raw LZ4 block compression format is detailed within <a href="https://github.com/lz4/lz4/blob/dev/doc/lz4_Block_format.md">lz4_Block_format</a>.

        Arbitrarily long files or data streams are compressed using multiple blocks, for streaming requirements. These blocks are organized into a frame,
        defined into ${url("https://github.com/lz4/lz4/blob/dev/doc/lz4_Frame_format.md", "lz4_Frame_format")}. Interoperable versions of LZ4 must also respect
        the frame format.
        
        <h3>In-place compression and decompression</h3>

        It's possible to have input and output sharing the same buffer, for highly contrained memory environments. In both cases, it requires input to lay at
        the end of the buffer, and decompression to start at beginning of the buffer. Buffer size must feature some margin, hence be larger than final size.
        ${codeBlock("""
|<------------------------buffer--------------------------------->|
                            |<-----------compressed data--------->|
|<-----------decompressed size------------------>|
                                                 |<----margin---->|""")}

        This technique is more useful for decompression, since decompressed size is typically larger, and margin is short.

        In-place decompression will work inside any buffer which size is &ge; {@code LZ4_DECOMPRESS_INPLACE_BUFFER_SIZE(decompressedSize)}. This presumes that
        {@code decompressedSize} &gt; {@code compressedSize}. Otherwise, it means compression actually expanded data, and it would be more efficient to store
        such data with a flag indicating it's not compressed. This can happen when data is not compressible (already compressed, or encrypted).

        For in-place compression, margin is larger, as it must be able to cope with both history preservation, requiring input data to remain unmodified up to
        #DISTANCE_MAX, and data expansion, which can happen when input is not compressible. As a consequence, buffer size requirements are much higher, and
        memory savings offered by in-place compression are more limited.

        There are ways to limit this cost for compression:
        ${ul(
            """
            Reduce history size, by modifying {@code LZ4_DISTANCE_MAX}. Note that it is a compile-time constant, so all compressions will apply this limit.
            Lower values will reduce compression ratio, except when input_size &lt; {@code LZ4_DISTANCE_MAX}, so it's a reasonable trick when inputs are known
            to be small.            
            """,
            """
            Require the compressor to deliver a "maximum compressed size". This is the {@code dstCapacity} parameter in {@code LZ4_compress*()}. When this size
            is &lt; {@code LZ4_COMPRESSBOUND(inputSize)}, then compression can fail, in which case, the return code will be 0 (zero). The caller must be ready
            for these cases to happen, and typically design a backup scheme to send data uncompressed.            
            """
        )}

        The combination of both techniques can significantly reduce the amount of margin required for in-place compression.

        In-place compression can work in any buffer which size is &ge; {@code (maxCompressedSize)} with {@code maxCompressedSize == LZ4_COMPRESSBOUND(srcSize)}
        for guaranteed compression success. #COMPRESS_INPLACE_BUFFER_SIZE() depends on both {@code maxCompressedSize} and {@code LZ4_DISTANCE_MAX}, so it's
        possible to reduce memory requirements by playing with them.
        """

    IntConstant(
        "Version number part.",

        "VERSION_MAJOR".."1",
        "VERSION_MINOR".."9",
        "VERSION_RELEASE".."3"
    )

    IntConstant("Version number.", "VERSION_NUMBER".."(LZ4_VERSION_MAJOR *100*100 + LZ4_VERSION_MINOR *100 + LZ4_VERSION_RELEASE)")
    StringConstant("Version string.", "VERSION_STRING".."""LZ4_VERSION_MAJOR + "." + LZ4_VERSION_MINOR + "." + LZ4_VERSION_RELEASE""")

    int("versionNumber", "Returns the version number.", void())
    Nonnull..charASCII.const.p("versionString", "Returns the version string.", void())

    IntConstant(
        "Maximum input size.",

        "MAX_INPUT_SIZE"..0x7E000000
    )

    IntConstant(
        """
        Memory usage formula : {@code N->2^N} Bytes (examples: {@code 10 -> 1KB; 12 -> 4KB ; 16 -> 64KB; 20 -> 1MB;} etc.)

        Increasing memory usage improves compression ratio. Reduced memory usage may improve speed, thanks to better cache locality. Default value is 14, for
        16KB, which nicely fits into Intel x86 L1 cache.
        """,
        "MEMORY_USAGE".."14"
    )

    IntConstant("", "HASHLOG".."(LZ4_MEMORY_USAGE - 2)")
    IntConstant("", "HASHTABLESIZE".."(1 << LZ4_MEMORY_USAGE)")
    IntConstant("", "HASH_SIZE_U32".."(1 << LZ4_HASHLOG)")

    IntConstant("", "STREAMSIZE".."16416")
    IntConstant("", "STREAMSIZE_VOIDP".."LZ4_STREAMSIZE / Pointer.POINTER_SIZE")

    IntConstant("", "STREAMDECODESIZE_U64".."4 + (Pointer.POINTER_SIZE == 16 ? 2 : 0)")
    IntConstant("", "STREAMDECODESIZE".."(LZ4_STREAMDECODESIZE_U64 * Long.BYTES)")

    IntConstant("History window size; can be user-defined at compile time.", "DISTANCE_MAX".."64")

    int(
        "compress_default",
        """
        Compresses {@code srcSize} bytes from buffer {@code src} into already allocated {@code dst} buffer of size {@code dstCapacity}.

        Compression is guaranteed to succeed if {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}. It also runs faster, so it's a recommended setting.

        If the function cannot compress {@code src} into a more limited {@code dst} budget, compression stops <i>immediately</i>, and the function result is
        zero. In which case, {@code dst} content is undefined (invalid).

        This function is protected against buffer overflow scenarios (never writes outside {@code dst} buffer, nor read outside {@code src} buffer).
        """,

        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", "max supported value is #MAX_INPUT_SIZE"),
        AutoSize("dst")..int("dstCapacity", "size of buffer {@code dst} (which must be already allocated)"),

        returnDoc = "the number of bytes written into buffer {@code dest} (necessarily &le; {@code maxOutputSize}) or 0 if compression fails"
    )

    int(
        "decompress_safe",
        """
        If destination buffer is not large enough, decoding will stop and output an error code (negative value).

        If the source stream is detected malformed, the function will stop decoding and return a negative result.

        Note 1: This function is protected against malicious data packets: it will never write outside {@code dst} buffer, nor read outside {@code source}
        buffer, even if the compressed block is maliciously modified to order the decoder to do these actions. In such case, the decoder stops immediately, and
        considers the compressed block malformed.
 
        Note 2: {@code compressedSize} and {@code dstCapacity} must be provided to the function, the compressed block does not contain them. The implementation
        is free to send / store / derive this information in whichever way is most beneficial. If there is a need for a different format which bundles together
        both compressed data and its metadata, consider looking at {@code lz4frame.h} instead.
        """,

        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("compressedSize", "is the exact complete size of the compressed block"),
        AutoSize("dst")..int(
            "dstCapacity",
            "is the size of destination buffer (which must be already allocated), presumed an upper bound of decompressed size"
        ),

        returnDoc = "the number of bytes decompressed into destination buffer (necessarily &le; {@code dstCapacity})"
    )

    macro(expression = "LZ4_MAX_INPUT_SIZE < isize ? 0 : isize + isize / 255 + 16")..int(
        "COMPRESSBOUND",
        "See #compressBound().",

        int("isize", "")
    )

    int(
        "compressBound",
        """
        Provides the maximum size that LZ4 compression may output in a "worst case" scenario (input data not compressible).

        This function is primarily useful for memory allocation purposes (destination buffer size). Macro #COMPRESSBOUND() is also provided for
        compilation-time evaluation (stack memory allocation for example).

        Note that #compress_default() compresses faster when {@code dstCapacity} is &ge; #compressBound(){@code (srcSize)}
        """,

        int("inputSize", "max supported value is #MAX_INPUT_SIZE"),

        returnDoc = "maximum output size in a \"worst case\" scenario or 0, if input size is incorrect (too large or negative)"
    )

    int(
        "compress_fast",
        """
        Same as #compress_default(), but allows selection of "acceleration" factor.

        The larger the acceleration value, the faster the algorithm, but also the lesser the compression. It's a trade-off. It can be fine tuned, with each
        successive value providing roughly +~3% to speed. An acceleration value of "1" is the same as regular #compress_default(). Values &le; 0 will be
        replaced by {@code LZ4_ACCELERATION_DEFAULT} (currently == 1, see lz4.c). Values &gt; {@code LZ4_ACCELERATION_MAX} will be replaced by
        {@code LZ4_ACCELERATION_MAX} (currently {@code == 65537}, see lz4.c).
        """,

        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),
        int("acceleration", "")
    )

    int("sizeofState", "", void())

    int(
        "compress_fast_extState",
        """
        Same as #compress_fast(), using an externally allocated memory space for its state.

        Use #sizeofState() to know how much memory must be allocated, and allocate it on 8-bytes boundaries (using {@code malloc()} typically). Then, provide
        it as {@code void* state} to compression function.
        """,

        Unsafe..void.p("state", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),
        int("acceleration", "")
    )

    int(
        "compress_destSize",
        """
        Reverse the logic: compresses as much data as possible from {@code src} buffer into already allocated buffer {@code dst} of size
        {@code targetDstSize}.

        This function either compresses the entire {@code src} content into {@code dst} if it's large enough, or fill {@code dst} buffer completely with as
        much data as possible from {@code src}. Note: acceleration parameter is fixed to {@code "default"}.
        """,

        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..Check(1)..int.p(
            "srcSizePtr",
            "will be modified to indicate how many bytes where read from {@code source} to fill {@code dest}. New value is necessarily &le; input value."
        ),
        AutoSize("dst")..int("targetDstSize", ""),

        returnDoc = "nb bytes written into {@code dest} (necessarily &le; {@code targetDestSize}) or 0 if compression fails"
    )

    int(
        "decompress_safe_partial",
        """
        Decompresses an LZ4 compressed block, of size {@code srcSize} at position {@code src}, into destination buffer {@code dst} of size {@code dstCapacity}.
        
        Up to {@code targetOutputSize} bytes will be decoded. The function stops decoding on reaching this objective. This can be useful to boost performance
        whenever only the beginning of a block is required.

        Notes:
        ${ol(
            "result can be &lt; {@code targetOutputSize}, if compressed block contains less data.",
            "{@code targetOutputSize} must be &le; {@code dstCapacity}",
            """
            this function effectively stops decoding on reaching {@code targetOutputSize}, so {@code dstCapacity} is kind of redundant. This is because in
            older versions of this function, decoding operation would still write complete sequences. Therefore, there was no guarantee that it would stop
            writing at exactly {@code targetOutputSize}, it could write more bytes, though only up to {@code dstCapacity}. Some "margin" used to be required
            for this operation to work properly. Thankfully, this is no longer necessary. The function nonetheless keeps the same signature, in an effort to
            preserve API compatibility.
            """,
            """
            if {@code srcSize} is the exact size of the block, then {@code targetOutputSize} can be any value, including larger than the block's decompressed
            size. The function will, at most, generate block's decompressed size.
            """,
            """
            if {@code srcSize} is <em>larger</em> than block's compressed size, then {@code targetOutputSize} <b>MUST</b> be &le; block's decompressed size.
            Otherwise, <em>silent corruption will occur</em>.
            """
        )}
        """,

        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("compressedSize", ""),
        int("targetOutputSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),

        returnDoc =
        """
        the number of bytes decoded in {@code dst} (necessarily &le; {@code targetOutputSize}). If source stream is detected malformed, function returns a
        negative result.
        """
    )

    LZ4_stream_t.p(
        "createStream",
        "Allocates and initializes an {@code LZ4_stream_t} structure.",
        void()
    )

    int(
        "freeStream",
        "Releases memory of an {@code LZ4_stream_t} structure.",

        LZ4_stream_t.p("streamPtr", "")
    )

    void(
        "resetStream_fast",
        """
        Use this to prepare an {@code LZ4_stream_t} for a new chain of dependent blocks (e.g., #compress_fast_continue()).

        An {@code LZ4_stream_t} must be initialized once before usage. This is automatically done when created by #createStream(). However, should the
        {@code LZ4_stream_t} be simply declared on stack (for example), it's necessary to initialize it first, using #initStream().

        After init, start any new stream with {@code LZ4_resetStream_fast()}. A same {@code LZ4_stream_t} can be re-used multiple times consecutively and
        compress multiple streams, provided that it starts each new stream with {@code LZ4_resetStream_fast()}.

        {@code LZ4_resetStream_fast()} is much faster than {@code LZ4_initStream()}, but is not compatible with memory regions containing garbage data.

        Note: it's only useful to call {@code LZ4_resetStream_fast()} in the context of streaming compression. The {@code extState} functions perform their own
        resets. Invoking {@code LZ4_resetStream_fast()} before is redundant, and even counterproductive.
        """,

        LZ4_stream_t.p("streamPtr", ""),

        since = "version 1.9.0"
    )

    int(
        "loadDict",
        """
        Use this function to reference a static dictionary into {@code LZ4_stream_t}.

        The dictionary must remain available during compression. {@code LZ4_loadDict()} triggers a reset, so any previous data will be forgotten. The same
        dictionary will have to be loaded on decompression side for successful decoding. Dictionarys are useful for better compression of small data (KB
        range). While LZ4 accepts any input as dictionary, results are generally better when using Zstandard's Dictionary Builder. Loading a size of 0 is
        allowed, and is the same as reset.
        """,

        LZ4_stream_t.p("streamPtr", ""),
        nullable..char.const.p("dictionary", ""),
        AutoSize("dictionary")..int("dictSize", ""),

        returnDoc = "loaded dictionary size, in bytes (necessarily &le; 64 KB)"
    )

    int(
        "compress_fast_continue",
        """
        Compress {@code src} content using data from previously compressed blocks, for better compression ratio.

        {@code dst} buffer must be already allocated. If {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}, compression is guaranteed to succeed, and
        runs faster.

        Note 1: Each invocation to {@code LZ4_compress_fast_continue()} generates a new block. Each block has precise boundaries. Each block must be
        decompressed separately, calling {@code LZ4_decompress_*()} with relevant metadata. It's not possible to append blocks together and expect a single
        invocation of {@code LZ4_decompress_*()} to decompress them together.

        Note 2: The previous 64KB of source data is <em>assumed</em> to remain present, unmodified, at same address in memory!

        Note 3: When input is structured as a double-buffer, each buffer can have any size, including &lt; 64 KB. Make sure that buffers are separated, by at
        least one byte. This construction ensures that each block only depends on previous block.

        Note 4: If input buffer is a ring-buffer, it can have any size, including &lt; 64 KB.
        """,

        LZ4_stream_t.p("streamPtr", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),
        int("acceleration", ""),

        returnDoc =
        """
        size of compressed block or 0 if there is an error (typically, cannot fit into {@code dst}). After an error, the stream status is undefined (invalid),
        it can only be reset or freed.
        """
    )

    int(
        "saveDict",
        """
        If last 64KB data cannot be guaranteed to remain available at its current memory location, save it into a safer place ({@code char* safeBuffer}).

        This is schematically equivalent to a {@code memcpy()} followed by #loadDict(), but is much faster, because {@code LZ4_saveDict()} doesn't need to
        rebuild tables.
        """,

        LZ4_stream_t.p("streamPtr", ""),
        char.p("safeBuffer", ""),
        AutoSize("safeBuffer")..int("maxDictSize", ""),

        returnDoc = "saved dictionary size in bytes (necessarily &le; {@code maxDictSize}), or 0 if error"
    )

    LZ4_streamDecode_t.p(
        "createStreamDecode",
        """
        Creates a streaming decompression tracking context.

        A tracking context can be re-used multiple times.
        """,
        void()
    )

    int(
        "freeStreamDecode",
        "Frees a streaming decompression tracking context.",

        LZ4_streamDecode_t.p("LZ4_stream", "")
    )

    intb(
        "setStreamDecode",
        """
        An {@code LZ4_streamDecode_t} context can be allocated once and re-used multiple times. Use this function to start decompression of a new stream of
        blocks.

        A dictionary can optionally be set. Use #NULL or size 0 for a reset order. Dictionary is presumed stable: it must remain accessible and unmodified
        during next decompression.
        """,

        LZ4_streamDecode_t.p("LZ4_streamDecode", ""),
        char.const.p("dictionary", ""),
        AutoSize("dictionary")..int("dictSize", ""),

        returnDoc = "1 if OK, 0 if error"
    )

    int(
        "decoderRingBufferSize",
        """
        In a ring buffer scenario (optional), blocks are presumed decompressed next to each other up to the moment there is not enough remaining space for next
        block ({@code remainingSize &lt; maxBlockSize}), at which stage it resumes from beginning of ring buffer. When setting such a ring buffer for streaming
        decompression, provides the minimum size of this ring buffer to be compatible with any source respecting {@code maxBlockSize} condition.
        """,

        int("maxBlockSize", ""),

        returnDoc = "minimum ring buffer size, or 0 if there is an error (invalid {@code maxBlockSize})",
        since = "version 1.8.2"
    )

    customMethod(
        """
    /** For static allocation; {@code maxBlockSize} presumed valid. */
    public static int LZ4_DECODER_RING_BUFFER_SIZE(int maxBlockSize) {
        return 65536 + 14 + maxBlockSize;
    }""")

    int(
        "decompress_safe_continue",
        """
        These decoding functions allow decompression of consecutive blocks in "streaming" mode.

        A block is an unsplittable entity, it must be presented entirely to a decompression function. Decompression functions only accept one block at a time.
        The last 64KB of previously decoded data <i>must</i> remain available and unmodified at the memory position where they were decoded. If less than 64KB
        of data has been decoded, all the data must be present.

        Special: if decompression side sets a ring buffer, it must respect one of the following conditions:
        ${ul(
            """
            Decompression buffer size is <i>at least</i> #decoderRingBufferSize()({@code maxBlockSize}). {@code maxBlockSize} is the maximum size of any single
            block. It can have any value &gt; 16 bytes. In which case, encoding and decoding buffers do not need to be synchronized. Actually, data can be
            produced by any source compliant with LZ4 format specification, and respecting {@code maxBlockSize}.
            """,
            """
            Synchronized mode:  Decompression buffer size is <i>exactly</i> the same as compression buffer size, and follows exactly same update rule (block
            boundaries at same positions), and decoding function is provided with exact decompressed size of each block (exception for last block of the
            stream), <i>then</i> decoding &amp; encoding ring buffer can have any size, including small ones ( &lt; 64 KB).
            """,
            """
            Decompression buffer is larger than encoding buffer, by a minimum of {@code maxBlockSize} more bytes. In which case, encoding and decoding buffers
            do not need to be synchronized, and encoding ring buffer can have any size, including small ones ( &lt; 64 KB).
            """
        )}
        Whenever these conditions are not possible, save the last 64KB of decoded data into a safe buffer where it can't be modified during decompression, then
        indicate where this data is saved using #setStreamDecode(), before decompressing next block.
        """,

        LZ4_streamDecode_t.p("LZ4_streamDecode", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", "")
    )

    int(
        "decompress_safe_usingDict",
        """
        These decoding functions work the same as a combination of #setStreamDecode() followed by {@code LZ4_decompress_*_continue()}. They are stand-alone,
        and don't need an {@code LZ4_streamDecode_t} structure.

        Dictionary is presumed stable: it must remain accessible and unmodified during decompression.

        Performance tip: Decompression speed can be substantially increased when {@code dst == dictStart + dictSize}.
        """,

        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),
        char.const.p("dictStart", ""),
        AutoSize("dictStart")..int("dictSize", "")
    )

    int(
        "compress_fast_extState_fastReset",
        """
        A variant of #compress_fast_extState().

        Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
        (see above comment on #resetStream_fast() for a definition of "correctly initialized"). From a high level, the difference is that this function
        initializes the provided state with a call to something like #resetStream_fast() while #compress_fast_extState() starts with a call to #initStream().
        """,

        Unsafe..void.p("state", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),
        int("acceleration", "")
    )

    void(
        "attach_dictionary",
        """
        This is an experimental API that allows efficient use of a static dictionary many times.

        Rather than re-loading the dictionary buffer into a working context before each compression, or copying a pre-loaded dictionary's {@code LZ4_stream_t}
        into a working {@code LZ4_stream_t}, this function introduces a no-copy setup mechanism, in which the working stream references the dictionary stream
        in-place.

        Several assumptions are made about the state of the dictionary stream. Currently, only streams which have been prepared by #loadDict() should be
        expected to work.

        Alternatively, the provided {@code dictionaryStream} may be #NULL, in which case any existing dictionary stream is unset.

        If a dictionary is provided, it replaces any pre-existing stream history. The dictionary contents are the only history that can be referenced and
        logically immediately precede the data compressed in the first subsequent compression call.

        The dictionary will only remain attached to the working stream through the first compression call, at the end of which it is cleared. The dictionary
        stream (and source buffer) must remain in-place / accessible / unchanged through the completion of the first compression call on the stream.
        """,

        LZ4_stream_t.p("workingStream", ""),
        nullable..LZ4_stream_t.const.p("dictionaryStream", "")
    )

    LZ4_stream_t.p(
        "initStream",
        """
        An {@code LZ4_stream_t} structure must be initialized at least once. This is automatically done when invoking createStream(), but it's not when the
        structure is simply declared on stack (for example).

        Use {@code LZ4_initStream()} to properly initialize a newly declared {@code LZ4_stream_t}. It can also initialize any arbitrary buffer of sufficient
        size, and will return a pointer of proper type upon initialization.

        Note: initialization fails if size and alignment conditions are not respected. In which case, the function will #NULL.

        Note 2: An {@code LZ4_stream_t} structure guarantees correct alignment and size.
        """,

        void.p("buffer", ""),
        AutoSize("buffer")..size_t("size", ""),

        since = "1.9.0"
    )

    macro(expression = "(compressedSize >>> 8) + 32")..int(
        "DECOMPRESS_INPLACE_MARGIN",
        "",

        int("compressedSize", "")
    )

    macro(expression = "decompressedSize + LZ4_DECOMPRESS_INPLACE_MARGIN(decompressedSize)")..int(
        "DECOMPRESS_INPLACE_BUFFER_SIZE",
        """
        Note: presumes that {@code compressedSize} &lt; {@code decompressedSize}.
        
        Note 2: margin is overestimated a bit, since it could use {@code compressedSize instead}.
        """,

        int("decompressedSize", "")
    )

    macro(expression = "LZ4_DISTANCE_MAX + 32")..int(
        "COMPRESS_INPLACE_MARGIN",
        "",

        void()
    )

    macro(expression = "maxCompressedSize + LZ4_COMPRESS_INPLACE_MARGIN()")..int(
        "COMPRESS_INPLACE_BUFFER_SIZE",
        "",

        int(
            "maxCompressedSize",
            "is generally #COMPRESSBOUND(){@code (inputSize)}, but can be set to any lower value, with the risk that compression can fail (return code 0)"
        )
    )
}
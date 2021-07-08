/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4HC = "LZ4HC".nativeClass(Module.LZ4, prefix = "LZ4HC", prefixMethod = "LZ4_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4_HC_STATIC_LINKING_ONLY
#include "lz4hc.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the high-compression API of ${url("http://lz4.github.io/lz4/", "LZ4")}.

        <h3>Streaming Compression - Bufferless synchronous API</h3>

        These functions compress data in successive blocks of any size, using previous blocks as dictionary, to improve compression ratio. One key assumption
        is that previous blocks (up to 64 KB) remain read-accessible while compressing next blocks. There is an exception for ring buffers, which can be
        smaller than 64 KB. Ring-buffer scenario is automatically detected and handled within #compress_HC_continue().

        Before starting compression, state must be allocated and properly initialized. #createStreamHC() does both, though compression level is set to
        #CLEVEL_DEFAULT.

        Selecting the compression level can be done with #resetStreamHC_fast() (starts a new stream) #setCompressionLevel() (anytime, between blocks in the
        same stream) (experimental). {@code LZ4_resetStreamHC_fast()} only works on states which have been properly initialized at least once, which is
        automatically the case when state is created using {@code LZ4_createStreamHC()}.

        After reset, a first "fictional block" can be designated as initial dictionary, using #loadDictHC() (Optional).

        Invoke #compress_HC_continue() to compress each successive block. The number of blocks is unlimited. Previous input blocks, including initial
        dictionary when present, must remain accessible and unmodified during compression.

        It's allowed to update compression level anytime between blocks, using {@code LZ4_setCompressionLevel()} (experimental).

        {@code dst} buffer should be sized to handle worst case scenarios (see #compressBound(), it ensures compression success). In case of failure, the API
        does not guarantee recovery, so the state <em>must</em> be reset. To ensure compression success whenever {@code dst} buffer size cannot be made &ge;
        {@code LZ4_compressBound()}, consider using #compress_HC_continue_destSize().

        Whenever previous input blocks can't be preserved unmodified in-place during compression of next blocks, it's possible to copy the last blocks into a
        more stable memory space, using #saveDictHC(). Return value of {@code LZ4_saveDictHC()} is the size of dictionary effectively saved into
        {@code safeBuffer} (&le; 64 KB)

        After completing a streaming compression, it's possible to start a new stream of blocks, using the same {@code LZ4_streamHC_t} state, just by
        resetting it, using {@code LZ4_resetStreamHC_fast()}.
        """

    IntConstant(
        "Compression level.",

        "CLEVEL_MIN".."3",
        "CLEVEL_DEFAULT".."9",
        "CLEVEL_OPT_MIN".."10",
        "CLEVEL_MAX".."12"
    )

    IntConstant("", "DICTIONARY_LOGSIZE".."16")
    IntConstant("", "MAXD".."(1 << LZ4HC_DICTIONARY_LOGSIZE)")
    IntConstant("", "MAXD_MASK".."(LZ4HC_MAXD - 1)")

    IntConstant("", "HASH_LOG".."15")
    IntConstant("", "HASHTABLESIZE".."(1 << LZ4HC_HASH_LOG)")
    IntConstant("", "HASH_MASK".."(LZ4HC_HASHTABLESIZE - 1)")

    IntConstant("", "LZ4_STREAMHCSIZE".."262200").noPrefix()
    IntConstant("", "LZ4_STREAMHCSIZE_VOIDP".."(LZ4_STREAMHCSIZE / Pointer.POINTER_SIZE)").noPrefix()

    int(
        "compress_HC",
        """
        Compress data from {@code src} into {@code dst}, using the powerful but slower "HC" algorithm.

        Compression is guaranteed to succeed if {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}`
        """,

        char.const.p("src", ""),
        char.p("dst", "must be already allocated"),
        AutoSize("src")..int("srcSize", "max supported value is #MAX_INPUT_SIZE"),
        AutoSize("dst")..int("dstCapacity", ""),
        int("compressionLevel", "any value between 1 and #CLEVEL_MAX will work. Values &gt; #CLEVEL_MAX behave the same as #CLEVEL_MAX."),

        returnDoc = "the number of bytes written into {@code dst} or 0 if compression fails"
    )

    int("sizeofStateHC", "", void())

    int(
        "compress_HC_extStateHC",
        """
        Same as #compress_HC(), but using an externally allocated memory segment for {@code state}.

        {@code state} size is provided by #sizeofStateHC(). Memory segment must be aligned on 8-bytes boundaries (which a normal {@code malloc()} should do
        properly).
        """,

        Unsafe..void.p("state", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("maxDstSize", ""),
        int("compressionLevel", "")
    )

    int(
        "compress_HC_destSize",
        "Will compress as much data as possible from {@code src} to fit into {@code targetDstSize} budget.",

        Unsafe..void.p("stateHC", ""),
        char.const.p("src", ""),
        char.p("dst", "") ,
        AutoSize("src")..Check(1)..int.p("srcSizePtr", "on success, {@code *srcSizePtr} is updated to indicate how much bytes were read from {@code src}"),
        AutoSize("dst")..int("targetDstSize", ""),
        int("compressionLevel", ""),

        returnDoc = "the number of bytes written into {@code dst} (necessarily &le; {@code targetDstSize}) or 0 if compression fails",
        since = "1.9.0"
    )

    LZ4_streamHC_t.p(
        "createStreamHC",
        """
        Creates memory for LZ4 HC streaming state.

        Newly created states are automatically initialized. A same state can be used multiple times consecutively, starting with #resetStreamHC_fast() to start
        a new stream of blocks.
        """,
        void()
    )

    int(
        "freeStreamHC",
        "Releases memory for LZ4 HC streaming state.",

        LZ4_streamHC_t.p("streamHCPtr", "")
    )

    void(
        "resetStreamHC_fast",
        """
        When an {@code LZ4_streamHC_t} is known to be in a internally coherent state, it can often be prepared for a new compression with almost no work, only
        sometimes falling back to the full, expensive reset that is always required when the stream is in an indeterminate state (i.e., the reset performed by
        #initStreamHC()).

        {@code LZ4_streamHC}s are guaranteed to be in a valid state when:
        ${ul(
            "returned from #createStreamHC()",
            "reset by #initStreamHC()",
            "{@code memset(stream, 0, sizeof(LZ4_streamHC_t))}",
            "the stream was in a valid state and was reset by #resetStreamHC_fast()",
            "the stream was in a valid state and was then used in any compression call that returned success",
            """
            the stream was in an indeterminate state and was used in a compression call that fully reset the state (#compress_HC_extStateHC()) and that
            returned success
            """
        )}

        Note: A stream that was last used in a compression call that returned an error may be passed to this function. However, it will be fully reset, which
        will clear any existing history and settings from the context.
        """,

        LZ4_streamHC_t.p("LZ4_streamHCPtr", ""),
        int("compressionLevel", "")
    )

    int(
        "loadDictHC",
        "",

        LZ4_streamHC_t.p("streamHCPtr", ""),
        char.const.p("dictionary", ""),
        AutoSize("dictionary")..int("dictSize", "")
    )

    int(
        "compress_HC_continue",
        "",

        LZ4_streamHC_t.p("streamHCPtr", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("maxDstSize", "")
    )

    int(
        "compress_HC_continue_destSize",
        "Similar to #compress_HC_continue(), but will read as much data as possible from {@code src} to fit into {@code targetDstSize} budget.",

        LZ4_streamHC_t.p("streamHCPtr", ""),
        char.const.p("src", ""),
        char.p("dst", ""),
        AutoSize("src")..Check(1)..int.p(
            "srcSizePtr",
            """
            on success, {@code *srcSizePtr} will be updated to indicate how much bytes were read from {@code src}. Note that this function may not consume the
            entire input.
            """
        ),
        AutoSize("dst")..int("targetDstSize", ""),

        returnDoc = "the number of bytes written into {@code dst} (necessarily &le; targetDstSize) or 0 if compression fails",
        since = "1.9.0"
    )

    int(
        "saveDictHC",
        "",

        LZ4_streamHC_t.p("streamHCPtr", ""),
        char.p("safeBuffer", ""),
        AutoSize("safeBuffer")..int("maxDictSize", "")
    )

    LZ4_streamHC_t.p(
        "initStreamHC",
        "Required before first use of a statically allocated {@code LZ4_streamHC_t}.",

        void.p("buffer", ""),
        AutoSize("buffer")..size_t("size", ""),

        since = "1.9.0"
    )

    void(
        "setCompressionLevel",
        "It's possible to change compression level between successive invocations of {@code LZ4_compress_HC_continue*()} for dynamic adaptation.",

        LZ4_streamHC_t.p("LZ4_streamHCPtr", ""),
        int("compressionLevel", "")
    )

    void(
        "favorDecompressionSpeed",
        """
        Parser will favor decompression speed over compression ratio.

        Only applicable to levels &ge; #CLEVEL_OPT_MIN.
        """,

        LZ4_streamHC_t.p("LZ4_streamHCPtr", ""),
        intb("favor", ""),

        since = "version 1.8.2 (experimental)"
    )

    int(
        "compress_HC_extStateHC_fastReset",
        """
        A variant of #compress_HC_extStateHC().

        Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
        (see comment on #resetStreamHC_fast() for a definition of "correctly initialized"). From a high level, the difference is that this function initializes
        the provided state with a call to #resetStreamHC_fast() while #compress_HC_extStateHC() starts with a call to #initStreamHC().
        """,

        Unsafe..void.p("state", ""),
        char.p.const("src", ""),
        char.p("dst", ""),
        AutoSize("src")..int("srcSize", ""),
        AutoSize("dst")..int("dstCapacity", ""),
        int("compressionLevel", "")
    )

    void(
        "attach_HC_dictionary",
        """
        This is an experimental API that allows for the efficient use of a static dictionary many times.

        Rather than re-loading the dictionary buffer into a working context before each compression, or copying a pre-loaded dictionary's
        {@code LZ4_streamHC_t} into a working {@code LZ4_streamHC_t}, this function introduces a no-copy setup mechanism, in which the working stream
        references the dictionary stream in-place.

        Several assumptions are made about the state of the dictionary stream. Currently, only streams which have been prepared by #loadDictHC() should be
        expected to work.

        Alternatively, the provided dictionary stream pointer may be #NULL, in which case any existing dictionary stream is unset.

        A dictionary should only be attached to a stream without any history (i.e., a stream that has just been reset).

        The dictionary will remain attached to the working stream only for the current stream session. Calls to #resetStreamHC_fast() will remove the
        dictionary context association from the working stream. The dictionary stream (and source buffer) must remain in-place / accessible / unchanged through
        the lifetime of the stream session.
        """,

        LZ4_streamHC_t.p("working_stream", ""),
        nullable..LZ4_streamHC_t.p.const("dictionary_stream", "")
    )
}
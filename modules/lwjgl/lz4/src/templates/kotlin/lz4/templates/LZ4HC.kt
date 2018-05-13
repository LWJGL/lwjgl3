/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lz4.templates

import org.lwjgl.generator.*
import lz4.*

val LZ4HC = "LZ4HC".nativeClass(Module.LZ4, prefix = "LZ4HC", prefixMethod = "LZ4_", library = LZ4_LIBRARY) {
    nativeDirective(
        """DISABLE_WARNINGS()
#define LZ4_HC_STATIC_LINKING_ONLY
#include "lz4hc.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Native bindings to the high-compression API of ${url("http://lz4.github.io/lz4/", "LZ4")}.

        <h3>Streaming Compression - Bufferless synchronous API</h3>

        These functions compress data in successive blocks of any size, using previous blocks as dictionary. One key assumption is that previous blocks (up to
        64 KB) remain read-accessible while compressing next blocks. There is an exception for ring buffers, which can be smaller than 64 KB. Ring buffers scenario is automatically detected and handled by LZ4_compress_HC_continue().

        Before starting compression, state must be properly initialized, using #resetStreamHC(). A first "fictional block" can then be designated as initial
        dictionary, using #loadDictHC() (Optional).

        Then, use #compress_HC_continue() to compress each successive block. Previous memory blocks (including initial dictionary when present) must remain
        accessible and unmodified during compression. {@code dst} buffer should be sized to handle worst case scenarios (see #compressBound()), to ensure
        operation success. Because in case of failure, the API does not guarantee context recovery, and context will have to be reset. If {@code dst} buffer
        budget cannot be &ge; #compressBound(), consider using #compress_HC_continue_destSize() instead.

        If, for any reason, previous data block can't be preserved unmodified in memory for next compression block, you can save it to a more stable memory
        space, using #saveDictHC(). Return value of #saveDictHC() is the size of dictionary effectively saved into {@code safeBuffer}.
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

    IntConstant("", "LZ4_STREAMHCSIZE".."(4*LZ4HC_HASHTABLESIZE + 2*LZ4HC_MAXD + 56)").noPrefix()
    IntConstant("", "LZ4_STREAMHCSIZE_SIZET".."(LZ4_STREAMHCSIZE / Pointer.POINTER_SIZE)").noPrefix()

    int(
        "compress_HC",
        """
        Compress data from {@code src} into {@code dst}, using the more powerful but slower "HC" algorithm. {@code dst} must be already allocated.

        Compression is guaranteed to succeed if {@code dstCapacity} &ge; #compressBound(){@code (srcSize)}`
        """,

        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", "max supported value is #MAX_INPUT_SIZE"),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        int.IN("compressionLevel", "any value between 1 and #CLEVEL_MAX will work. Values &gt; #CLEVEL_MAX behave the same as #CLEVEL_MAX."),

        returnDoc = "the number of bytes written into {@code dst} or 0 if compression fails"
    )

    int(
        "sizeofStateHC",
        ""
    )

    int(
        "compress_HC_extStateHC",
        """
        Same as #compress_HC(), but using an externally allocated memory segment for {@code state}.

        {@code state} size is provided by #sizeofStateHC(). Memory segment must be aligned on 8-bytes boundaries (which a normal {@code malloc()} should do
        properly).
        """,

        Unsafe..void.p.OUT("state", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("maxDstSize", ""),
        int.IN("compressionLevel", "")
    )

    LZ4_streamHC_t.p(
        "createStreamHC",
        """
        Creates memory for LZ4 HC streaming state.

        Newly created states are automatically initialized. Existing states can be re-used several times, using #resetStreamHC().
        """
    )

    int(
        "freeStreamHC",
        "Releases memory for LZ4 HC streaming state.",

        LZ4_streamHC_t.p.IN("streamHCPtr", "")
    )

    void(
        "resetStreamHC",
        "",

        LZ4_streamHC_t.p.IN("streamHCPtr", ""),
        int.IN("compressionLevel", "")
    )

    int(
        "loadDictHC",
        "",

        LZ4_streamHC_t.p.IN("streamHCPtr", ""),
        char.const.p.IN("dictionary", ""),
        AutoSize("dictionary")..int.IN("dictSize", "")
    )

    int(
        "compress_HC_continue",
        "",

        LZ4_streamHC_t.p.IN("streamHCPtr", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("maxDstSize", "")
    )

    int(
        "saveDictHC",
        "",

        LZ4_streamHC_t.p.IN("streamHCPtr", ""),
        char.p.OUT("safeBuffer", ""),
        AutoSize("safeBuffer")..int.IN("maxDictSize", "")
    )

    int(
        "compress_HC_destSize",
        "Will try to compress as much data from {@code src} as possible that can fit into {@code targetDstSize} budget.",

        Unsafe..void.p.OUT("LZ4HC_Data", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..Check(1)..int.p.INOUT("srcSizePtr", "value will be updated to indicate how much bytes were read from {@code src}"),
        AutoSize("dst")..int.IN("targetDstSize", ""),
        int.IN("compressionLevel", ""),

        returnDoc = "the number of bytes written into {@code dst} or 0 if compression fails"
    )

    int(
        "compress_HC_continue_destSize",
        "Similar as #compress_HC_continue(), but will read a variable nb of bytes from {@code src} to fit into {@code targetDstSize} budget.",

        LZ4_streamHC_t.p.IN("LZ4_streamHCPtr", ""),
        char.const.p.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..Check(1)..int.p.INOUT("srcSizePtr", "value will be updated to indicate how much bytes were read from {@code src}"),
        AutoSize("dst")..int.IN("targetDstSize", ""),

        returnDoc = "the number of bytes written into {@code dst} or 0 if compression fails"
    )

    void(
        "setCompressionLevel",
        "It's possible to change compression level between 2 invocations of {@code LZ4_compress_HC_continue*()}.",

        LZ4_streamHC_t.p.IN("LZ4_streamHCPtr", ""),
        int.IN("compressionLevel", "")
    )

    void(
        "favorDecompressionSpeed",
        """
        Parser will select decisions favoring decompression over compression ratio.

        Only works at highest compression settings (level &ge; #CLEVEL_OPT_MIN)
        """,

        LZ4_streamHC_t.p.IN("LZ4_streamHCPtr", ""),
        intb.IN("favor", ""),

        since = "version 1.8.2 (experimental)"
    )

    void(
        "resetStreamHC_fast",
        """
        When an {@code LZ4_streamHC_t} is known to be in a internally coherent state, it can often be prepared for a new compression with almost no work, only
        sometimes falling back to the full, expensive reset that is always required when the stream is in an indeterminate state (i.e., the reset performed by
        #resetStreamHC()).

        {@code LZ4_streamHC}s are guaranteed to be in a valid state when:
        ${ul(
            "returned from #createStreamHC()",
            "reset by #resetStreamHC()",
            "{@code memset(stream, 0, sizeof(LZ4_streamHC_t))}",
            "the stream was in a valid state and was reset by #resetStreamHC_fast()",
            "the stream was in a valid state and was then used in any compression call that returned success",
            """
            the stream was in an indeterminate state and was used in a compression call that fully reset the state (#compress_HC_extStateHC()) and that
            returned success
            """
        )}
        """,

        LZ4_streamHC_t.p.IN("LZ4_streamHCPtr", ""),
        int.IN("compressionLevel", "")
    )

    int(
        "compress_HC_extStateHC_fastReset",
        """
        A variant of #compress_HC_extStateHC().

        Using this variant avoids an expensive initialization step. It is only safe to call if the state buffer is known to be correctly initialized already
        (see comment on #resetStreamHC_fast() for a definition of "correctly initialized"). From a high level, the difference is that this function initializes
        the provided state with a call to #resetStreamHC_fast() while #compress_HC_extStateHC() starts with a call to #resetStreamHC().
        """,

        Unsafe..void.p.OUT("state", ""),
        char.p.const.IN("src", ""),
        char.p.OUT("dst", ""),
        AutoSize("src")..int.IN("srcSize", ""),
        AutoSize("dst")..int.IN("dstCapacity", ""),
        int.IN("compressionLevel", "")
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

        The dictionary will remain attached to the working stream only for the current stream session. Calls to {@code LZ4_resetStreamHC(_fast)} will remove
        the dictionary context association from the working stream. The dictionary stream (and source buffer) must remain in-place / accessible / unchanged
        through the lifetime of the stream session.
        """,

        LZ4_streamHC_t.p.IN("working_stream", ""),
        nullable..LZ4_streamHC_t.p.const.IN("dictionary_stream", "")
    )
}
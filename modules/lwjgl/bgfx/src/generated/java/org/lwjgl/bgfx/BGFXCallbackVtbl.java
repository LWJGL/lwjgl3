/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Callback virtual table.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code fatal} &ndash; the fatal error callback</li>
 * <li>{@code trace_vargs} &ndash; the debug message callback</li>
 * <li>{@code profiler_begin} &ndash; the profiler begin callback</li>
 * <li>{@code profiler_begin_literal} &ndash; the profiler begin literal callback</li>
 * <li>{@code profiler_end} &ndash; the profiler end callback</li>
 * <li>{@code cache_read_size} &ndash; the cache read size callback</li>
 * <li>{@code cache_read} &ndash; the cache read callback</li>
 * <li>{@code cache_write} &ndash; the cache write callback</li>
 * <li>{@code screen_shot} &ndash; the screenshot callback</li>
 * <li>{@code capture_begin} &ndash; the capture begin callback</li>
 * <li>{@code capture_end} &ndash; the capture end callback</li>
 * <li>{@code capture_frame} &ndash; the capture framecallback</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_callback_vtbl_t {
 *     void (*{@link BGFXFatalCallbackI fatal}) (bgfx_callback_interface_t *_this, char const *_filePath, uint16_t _line, bgfx_fatal_t _code, char const *_str);
 *     void (*{@link BGFXTraceVarArgsCallbackI trace_vargs}) (bgfx_callback_interface_t *_this, char const *_filePath, uint16_t _line, char const *_format, va_list _argList);
 *     void (*{@link BGFXProfilerBeginI profiler_begin}) (bgfx_callback_interface_t *_this, char const *_name, uint32_t _abgr, char const *_filePath, uint16_t _line);
 *     void (*{@link BGFXProfilerBeginLiteralI profiler_begin_literal}) (bgfx_callback_interface_t *_this, char const *_name, uint32_t _abgr, char const *_filePath, uint16_t _line);
 *     void (*{@link BGFXProfilerEndI profiler_end}) (bgfx_callback_interface_t *_this);
 *     uint32_t (*{@link BGFXCacheReadSizeCallbackI cache_read_size}) (bgfx_callback_interface_t *_this, uint64_t _id);
 *     bool (*{@link BGFXCacheReadCallbackI cache_read}) (bgfx_callback_interface_t *_this, uint64_t _id, void *_data, uint32_t _size);
 *     void (*{@link BGFXCacheWriteCallbackI cache_write}) (bgfx_callback_interface_t *_this, uint64_t _id, void const *_data, uint32_t _size);
 *     void (*{@link BGFXScreenShotCallbackI screen_shot}) (bgfx_callback_interface_t *_this, char const *_filePath, uint32_t _width, uint32_t _height, uint32_t _pitch, void const *_data, uint32_t _size, bool _yflip);
 *     void (*{@link BGFXCaptureBeginCallbackI capture_begin}) (bgfx_callback_interface_t *_this, uint32_t _width, uint32_t _height, uint32_t _pitch, bgfx_texture_format_t _format, bool _yflip);
 *     void (*{@link BGFXCaptureEndCallbackI capture_end}) (bgfx_callback_interface_t *_this);
 *     void (*{@link BGFXCaptureFrameCallbackI capture_frame}) (bgfx_callback_interface_t *_this, void const *_data, uint32_t _size);
 * }</code></pre>
 */
@NativeType("struct bgfx_callback_vtbl_t")
public class BGFXCallbackVtbl extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FATAL,
        TRACE_VARGS,
        PROFILER_BEGIN,
        PROFILER_BEGIN_LITERAL,
        PROFILER_END,
        CACHE_READ_SIZE,
        CACHE_READ,
        CACHE_WRITE,
        SCREEN_SHOT,
        CAPTURE_BEGIN,
        CAPTURE_END,
        CAPTURE_FRAME;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FATAL = layout.offsetof(0);
        TRACE_VARGS = layout.offsetof(1);
        PROFILER_BEGIN = layout.offsetof(2);
        PROFILER_BEGIN_LITERAL = layout.offsetof(3);
        PROFILER_END = layout.offsetof(4);
        CACHE_READ_SIZE = layout.offsetof(5);
        CACHE_READ = layout.offsetof(6);
        CACHE_WRITE = layout.offsetof(7);
        SCREEN_SHOT = layout.offsetof(8);
        CAPTURE_BEGIN = layout.offsetof(9);
        CAPTURE_END = layout.offsetof(10);
        CAPTURE_FRAME = layout.offsetof(11);
    }

    /**
     * Creates a {@code BGFXCallbackVtbl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCallbackVtbl(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code fatal} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint16_t, bgfx_fatal_t, char const *)")
    public BGFXFatalCallback fatal() { return nfatal(address()); }
    /** Returns the value of the {@code trace_vargs} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint16_t, char const *, va_list)")
    public BGFXTraceVarArgsCallback trace_vargs() { return ntrace_vargs(address()); }
    /** Returns the value of the {@code profiler_begin} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, char const *, uint16_t)")
    public BGFXProfilerBegin profiler_begin() { return nprofiler_begin(address()); }
    /** Returns the value of the {@code profiler_begin_literal} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, char const *, uint16_t)")
    public BGFXProfilerBeginLiteral profiler_begin_literal() { return nprofiler_begin_literal(address()); }
    /** Returns the value of the {@code profiler_end} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *)")
    public BGFXProfilerEnd profiler_end() { return nprofiler_end(address()); }
    /** Returns the value of the {@code cache_read_size} field. */
    @NativeType("uint32_t (*) (bgfx_callback_interface_t *, uint64_t)")
    public BGFXCacheReadSizeCallback cache_read_size() { return ncache_read_size(address()); }
    /** Returns the value of the {@code cache_read} field. */
    @NativeType("bool (*) (bgfx_callback_interface_t *, uint64_t, void *, uint32_t)")
    public BGFXCacheReadCallback cache_read() { return ncache_read(address()); }
    /** Returns the value of the {@code cache_write} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, uint64_t, void const *, uint32_t)")
    public BGFXCacheWriteCallback cache_write() { return ncache_write(address()); }
    /** Returns the value of the {@code screen_shot} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, uint32_t, uint32_t, void const *, uint32_t, bool)")
    public BGFXScreenShotCallback screen_shot() { return nscreen_shot(address()); }
    /** Returns the value of the {@code capture_begin} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, uint32_t, uint32_t, uint32_t, bgfx_texture_format_t, bool)")
    public BGFXCaptureBeginCallback capture_begin() { return ncapture_begin(address()); }
    /** Returns the value of the {@code capture_end} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *)")
    public BGFXCaptureEndCallback capture_end() { return ncapture_end(address()); }
    /** Returns the value of the {@code capture_frame} field. */
    @NativeType("void (*) (bgfx_callback_interface_t *, void const *, uint32_t)")
    public BGFXCaptureFrameCallback capture_frame() { return ncapture_frame(address()); }

    /** Sets the specified value to the {@code fatal} field. */
    public BGFXCallbackVtbl fatal(@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint16_t, bgfx_fatal_t, char const *)") BGFXFatalCallbackI value) { nfatal(address(), value); return this; }
    /** Sets the specified value to the {@code trace_vargs} field. */
    public BGFXCallbackVtbl trace_vargs(@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint16_t, char const *, va_list)") BGFXTraceVarArgsCallbackI value) { ntrace_vargs(address(), value); return this; }
    /** Sets the specified value to the {@code profiler_begin} field. */
    public BGFXCallbackVtbl profiler_begin(@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, char const *, uint16_t)") BGFXProfilerBeginI value) { nprofiler_begin(address(), value); return this; }
    /** Sets the specified value to the {@code profiler_begin_literal} field. */
    public BGFXCallbackVtbl profiler_begin_literal(@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, char const *, uint16_t)") BGFXProfilerBeginLiteralI value) { nprofiler_begin_literal(address(), value); return this; }
    /** Sets the specified value to the {@code profiler_end} field. */
    public BGFXCallbackVtbl profiler_end(@NativeType("void (*) (bgfx_callback_interface_t *)") BGFXProfilerEndI value) { nprofiler_end(address(), value); return this; }
    /** Sets the specified value to the {@code cache_read_size} field. */
    public BGFXCallbackVtbl cache_read_size(@NativeType("uint32_t (*) (bgfx_callback_interface_t *, uint64_t)") BGFXCacheReadSizeCallbackI value) { ncache_read_size(address(), value); return this; }
    /** Sets the specified value to the {@code cache_read} field. */
    public BGFXCallbackVtbl cache_read(@NativeType("bool (*) (bgfx_callback_interface_t *, uint64_t, void *, uint32_t)") BGFXCacheReadCallbackI value) { ncache_read(address(), value); return this; }
    /** Sets the specified value to the {@code cache_write} field. */
    public BGFXCallbackVtbl cache_write(@NativeType("void (*) (bgfx_callback_interface_t *, uint64_t, void const *, uint32_t)") BGFXCacheWriteCallbackI value) { ncache_write(address(), value); return this; }
    /** Sets the specified value to the {@code screen_shot} field. */
    public BGFXCallbackVtbl screen_shot(@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, uint32_t, uint32_t, void const *, uint32_t, bool)") BGFXScreenShotCallbackI value) { nscreen_shot(address(), value); return this; }
    /** Sets the specified value to the {@code capture_begin} field. */
    public BGFXCallbackVtbl capture_begin(@NativeType("void (*) (bgfx_callback_interface_t *, uint32_t, uint32_t, uint32_t, bgfx_texture_format_t, bool)") BGFXCaptureBeginCallbackI value) { ncapture_begin(address(), value); return this; }
    /** Sets the specified value to the {@code capture_end} field. */
    public BGFXCallbackVtbl capture_end(@NativeType("void (*) (bgfx_callback_interface_t *)") BGFXCaptureEndCallbackI value) { ncapture_end(address(), value); return this; }
    /** Sets the specified value to the {@code capture_frame} field. */
    public BGFXCallbackVtbl capture_frame(@NativeType("void (*) (bgfx_callback_interface_t *, void const *, uint32_t)") BGFXCaptureFrameCallbackI value) { ncapture_frame(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXCallbackVtbl set(
        BGFXFatalCallbackI fatal,
        BGFXTraceVarArgsCallbackI trace_vargs,
        BGFXProfilerBeginI profiler_begin,
        BGFXProfilerBeginLiteralI profiler_begin_literal,
        BGFXProfilerEndI profiler_end,
        BGFXCacheReadSizeCallbackI cache_read_size,
        BGFXCacheReadCallbackI cache_read,
        BGFXCacheWriteCallbackI cache_write,
        BGFXScreenShotCallbackI screen_shot,
        BGFXCaptureBeginCallbackI capture_begin,
        BGFXCaptureEndCallbackI capture_end,
        BGFXCaptureFrameCallbackI capture_frame
    ) {
        fatal(fatal);
        trace_vargs(trace_vargs);
        profiler_begin(profiler_begin);
        profiler_begin_literal(profiler_begin_literal);
        profiler_end(profiler_end);
        cache_read_size(cache_read_size);
        cache_read(cache_read);
        cache_write(cache_write);
        screen_shot(screen_shot);
        capture_begin(capture_begin);
        capture_end(capture_end);
        capture_frame(capture_frame);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXCallbackVtbl set(BGFXCallbackVtbl src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXCallbackVtbl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXCallbackVtbl malloc() {
        return wrap(BGFXCallbackVtbl.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXCallbackVtbl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXCallbackVtbl calloc() {
        return wrap(BGFXCallbackVtbl.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXCallbackVtbl} instance allocated with {@link BufferUtils}. */
    public static BGFXCallbackVtbl create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXCallbackVtbl.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXCallbackVtbl} instance for the specified memory address. */
    public static BGFXCallbackVtbl create(long address) {
        return wrap(BGFXCallbackVtbl.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXCallbackVtbl createSafe(long address) {
        return address == NULL ? null : wrap(BGFXCallbackVtbl.class, address);
    }

    // -----------------------------------

    /** Returns a new {@code BGFXCallbackVtbl} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXCallbackVtbl mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BGFXCallbackVtbl} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXCallbackVtbl callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BGFXCallbackVtbl} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXCallbackVtbl mallocStack(MemoryStack stack) {
        return wrap(BGFXCallbackVtbl.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXCallbackVtbl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXCallbackVtbl callocStack(MemoryStack stack) {
        return wrap(BGFXCallbackVtbl.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #fatal}. */
    public static BGFXFatalCallback nfatal(long struct) { return BGFXFatalCallback.create(memGetAddress(struct + BGFXCallbackVtbl.FATAL)); }
    /** Unsafe version of {@link #trace_vargs}. */
    public static BGFXTraceVarArgsCallback ntrace_vargs(long struct) { return BGFXTraceVarArgsCallback.create(memGetAddress(struct + BGFXCallbackVtbl.TRACE_VARGS)); }
    /** Unsafe version of {@link #profiler_begin}. */
    public static BGFXProfilerBegin nprofiler_begin(long struct) { return BGFXProfilerBegin.create(memGetAddress(struct + BGFXCallbackVtbl.PROFILER_BEGIN)); }
    /** Unsafe version of {@link #profiler_begin_literal}. */
    public static BGFXProfilerBeginLiteral nprofiler_begin_literal(long struct) { return BGFXProfilerBeginLiteral.create(memGetAddress(struct + BGFXCallbackVtbl.PROFILER_BEGIN_LITERAL)); }
    /** Unsafe version of {@link #profiler_end}. */
    public static BGFXProfilerEnd nprofiler_end(long struct) { return BGFXProfilerEnd.create(memGetAddress(struct + BGFXCallbackVtbl.PROFILER_END)); }
    /** Unsafe version of {@link #cache_read_size}. */
    public static BGFXCacheReadSizeCallback ncache_read_size(long struct) { return BGFXCacheReadSizeCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ_SIZE)); }
    /** Unsafe version of {@link #cache_read}. */
    public static BGFXCacheReadCallback ncache_read(long struct) { return BGFXCacheReadCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ)); }
    /** Unsafe version of {@link #cache_write}. */
    public static BGFXCacheWriteCallback ncache_write(long struct) { return BGFXCacheWriteCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CACHE_WRITE)); }
    /** Unsafe version of {@link #screen_shot}. */
    public static BGFXScreenShotCallback nscreen_shot(long struct) { return BGFXScreenShotCallback.create(memGetAddress(struct + BGFXCallbackVtbl.SCREEN_SHOT)); }
    /** Unsafe version of {@link #capture_begin}. */
    public static BGFXCaptureBeginCallback ncapture_begin(long struct) { return BGFXCaptureBeginCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_BEGIN)); }
    /** Unsafe version of {@link #capture_end}. */
    public static BGFXCaptureEndCallback ncapture_end(long struct) { return BGFXCaptureEndCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_END)); }
    /** Unsafe version of {@link #capture_frame}. */
    public static BGFXCaptureFrameCallback ncapture_frame(long struct) { return BGFXCaptureFrameCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_FRAME)); }

    /** Unsafe version of {@link #fatal(BGFXFatalCallbackI) fatal}. */
    public static void nfatal(long struct, BGFXFatalCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.FATAL, value.address()); }
    /** Unsafe version of {@link #trace_vargs(BGFXTraceVarArgsCallbackI) trace_vargs}. */
    public static void ntrace_vargs(long struct, BGFXTraceVarArgsCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.TRACE_VARGS, value.address()); }
    /** Unsafe version of {@link #profiler_begin(BGFXProfilerBeginI) profiler_begin}. */
    public static void nprofiler_begin(long struct, BGFXProfilerBeginI value) { memPutAddress(struct + BGFXCallbackVtbl.PROFILER_BEGIN, value.address()); }
    /** Unsafe version of {@link #profiler_begin_literal(BGFXProfilerBeginLiteralI) profiler_begin_literal}. */
    public static void nprofiler_begin_literal(long struct, BGFXProfilerBeginLiteralI value) { memPutAddress(struct + BGFXCallbackVtbl.PROFILER_BEGIN_LITERAL, value.address()); }
    /** Unsafe version of {@link #profiler_end(BGFXProfilerEndI) profiler_end}. */
    public static void nprofiler_end(long struct, BGFXProfilerEndI value) { memPutAddress(struct + BGFXCallbackVtbl.PROFILER_END, value.address()); }
    /** Unsafe version of {@link #cache_read_size(BGFXCacheReadSizeCallbackI) cache_read_size}. */
    public static void ncache_read_size(long struct, BGFXCacheReadSizeCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CACHE_READ_SIZE, value.address()); }
    /** Unsafe version of {@link #cache_read(BGFXCacheReadCallbackI) cache_read}. */
    public static void ncache_read(long struct, BGFXCacheReadCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CACHE_READ, value.address()); }
    /** Unsafe version of {@link #cache_write(BGFXCacheWriteCallbackI) cache_write}. */
    public static void ncache_write(long struct, BGFXCacheWriteCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CACHE_WRITE, value.address()); }
    /** Unsafe version of {@link #screen_shot(BGFXScreenShotCallbackI) screen_shot}. */
    public static void nscreen_shot(long struct, BGFXScreenShotCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.SCREEN_SHOT, value.address()); }
    /** Unsafe version of {@link #capture_begin(BGFXCaptureBeginCallbackI) capture_begin}. */
    public static void ncapture_begin(long struct, BGFXCaptureBeginCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CAPTURE_BEGIN, value.address()); }
    /** Unsafe version of {@link #capture_end(BGFXCaptureEndCallbackI) capture_end}. */
    public static void ncapture_end(long struct, BGFXCaptureEndCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CAPTURE_END, value.address()); }
    /** Unsafe version of {@link #capture_frame(BGFXCaptureFrameCallbackI) capture_frame}. */
    public static void ncapture_frame(long struct, BGFXCaptureFrameCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CAPTURE_FRAME, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXCallbackVtbl.FATAL));
        check(memGetAddress(struct + BGFXCallbackVtbl.TRACE_VARGS));
        check(memGetAddress(struct + BGFXCallbackVtbl.PROFILER_BEGIN));
        check(memGetAddress(struct + BGFXCallbackVtbl.PROFILER_BEGIN_LITERAL));
        check(memGetAddress(struct + BGFXCallbackVtbl.PROFILER_END));
        check(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ_SIZE));
        check(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ));
        check(memGetAddress(struct + BGFXCallbackVtbl.CACHE_WRITE));
        check(memGetAddress(struct + BGFXCallbackVtbl.SCREEN_SHOT));
        check(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_BEGIN));
        check(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_END));
        check(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_FRAME));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

}
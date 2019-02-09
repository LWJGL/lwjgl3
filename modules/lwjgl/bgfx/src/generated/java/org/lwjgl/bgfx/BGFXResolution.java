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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Backbuffer resolution and reset parameters.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code format} &ndash; backbuffer format</li>
 * <li>{@code width} &ndash; backbuffer width</li>
 * <li>{@code height} &ndash; backbuffer height</li>
 * <li>{@code reset} &ndash; reset parameters</li>
 * <li>{@code numBackBuffers} &ndash; number of back buffers</li>
 * <li>{@code maxFrameLatency} &ndash; maximum frame latency</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_resolution_t {
 *     bgfx_texture_format_t format;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t reset;
 *     uint8_t numBackBuffers;
 *     uint8_t maxFrameLatency;
 * }</code></pre>
 */
@NativeType("struct bgfx_resolution_t")
public class BGFXResolution extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        WIDTH,
        HEIGHT,
        RESET,
        NUMBACKBUFFERS,
        MAXFRAMELATENCY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        RESET = layout.offsetof(3);
        NUMBACKBUFFERS = layout.offsetof(4);
        MAXFRAMELATENCY = layout.offsetof(5);
    }

    /**
     * Creates a {@code BGFXResolution} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXResolution(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code format} field. */
    @NativeType("bgfx_texture_format_t")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code reset} field. */
    @NativeType("uint32_t")
    public int reset() { return nreset(address()); }
    /** Returns the value of the {@code numBackBuffers} field. */
    @NativeType("uint8_t")
    public byte numBackBuffers() { return nnumBackBuffers(address()); }
    /** Returns the value of the {@code maxFrameLatency} field. */
    @NativeType("uint8_t")
    public byte maxFrameLatency() { return nmaxFrameLatency(address()); }

    /** Sets the specified value to the {@code format} field. */
    public BGFXResolution format(@NativeType("bgfx_texture_format_t") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public BGFXResolution width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public BGFXResolution height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code reset} field. */
    public BGFXResolution reset(@NativeType("uint32_t") int value) { nreset(address(), value); return this; }
    /** Sets the specified value to the {@code numBackBuffers} field. */
    public BGFXResolution numBackBuffers(@NativeType("uint8_t") byte value) { nnumBackBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code maxFrameLatency} field. */
    public BGFXResolution maxFrameLatency(@NativeType("uint8_t") byte value) { nmaxFrameLatency(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXResolution set(
        int format,
        int width,
        int height,
        int reset,
        byte numBackBuffers,
        byte maxFrameLatency
    ) {
        format(format);
        width(width);
        height(height);
        reset(reset);
        numBackBuffers(numBackBuffers);
        maxFrameLatency(maxFrameLatency);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXResolution set(BGFXResolution src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXResolution} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXResolution malloc() {
        return wrap(BGFXResolution.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXResolution} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXResolution calloc() {
        return wrap(BGFXResolution.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXResolution} instance allocated with {@link BufferUtils}. */
    public static BGFXResolution create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXResolution.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXResolution} instance for the specified memory address. */
    public static BGFXResolution create(long address) {
        return wrap(BGFXResolution.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXResolution createSafe(long address) {
        return address == NULL ? null : wrap(BGFXResolution.class, address);
    }

    // -----------------------------------

    /** Returns a new {@code BGFXResolution} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXResolution mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BGFXResolution} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXResolution callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BGFXResolution} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXResolution mallocStack(MemoryStack stack) {
        return wrap(BGFXResolution.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXResolution} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXResolution callocStack(MemoryStack stack) {
        return wrap(BGFXResolution.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + BGFXResolution.FORMAT); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + BGFXResolution.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + BGFXResolution.HEIGHT); }
    /** Unsafe version of {@link #reset}. */
    public static int nreset(long struct) { return UNSAFE.getInt(null, struct + BGFXResolution.RESET); }
    /** Unsafe version of {@link #numBackBuffers}. */
    public static byte nnumBackBuffers(long struct) { return UNSAFE.getByte(null, struct + BGFXResolution.NUMBACKBUFFERS); }
    /** Unsafe version of {@link #maxFrameLatency}. */
    public static byte nmaxFrameLatency(long struct) { return UNSAFE.getByte(null, struct + BGFXResolution.MAXFRAMELATENCY); }

    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + BGFXResolution.FORMAT, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + BGFXResolution.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + BGFXResolution.HEIGHT, value); }
    /** Unsafe version of {@link #reset(int) reset}. */
    public static void nreset(long struct, int value) { UNSAFE.putInt(null, struct + BGFXResolution.RESET, value); }
    /** Unsafe version of {@link #numBackBuffers(byte) numBackBuffers}. */
    public static void nnumBackBuffers(long struct, byte value) { UNSAFE.putByte(null, struct + BGFXResolution.NUMBACKBUFFERS, value); }
    /** Unsafe version of {@link #maxFrameLatency(byte) maxFrameLatency}. */
    public static void nmaxFrameLatency(long struct, byte value) { UNSAFE.putByte(null, struct + BGFXResolution.MAXFRAMELATENCY, value); }

}
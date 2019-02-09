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
 * Platform data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code ndt} &ndash; native display type</li>
 * <li>{@code nwh} &ndash; native window handle</li>
 * <li>{@code context} &ndash; GL context, or D3D device</li>
 * <li>{@code backBuffer} &ndash; GL backbuffer, or D3D render target view</li>
 * <li>{@code backBufferDS} &ndash; Backbuffer depth/stencil</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_platform_data_t {
 *     void * ndt;
 *     void * nwh;
 *     void * context;
 *     void * backBuffer;
 *     void * backBufferDS;
 * }</code></pre>
 */
@NativeType("struct bgfx_platform_data_t")
public class BGFXPlatformData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NDT,
        NWH,
        CONTEXT,
        BACKBUFFER,
        BACKBUFFERDS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NDT = layout.offsetof(0);
        NWH = layout.offsetof(1);
        CONTEXT = layout.offsetof(2);
        BACKBUFFER = layout.offsetof(3);
        BACKBUFFERDS = layout.offsetof(4);
    }

    /**
     * Creates a {@code BGFXPlatformData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXPlatformData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ndt} field. */
    @NativeType("void *")
    public long ndt() { return nndt(address()); }
    /** Returns the value of the {@code nwh} field. */
    @NativeType("void *")
    public long nwh() { return nnwh(address()); }
    /** Returns the value of the {@code context} field. */
    @NativeType("void *")
    public long context() { return ncontext(address()); }
    /** Returns the value of the {@code backBuffer} field. */
    @NativeType("void *")
    public long backBuffer() { return nbackBuffer(address()); }
    /** Returns the value of the {@code backBufferDS} field. */
    @NativeType("void *")
    public long backBufferDS() { return nbackBufferDS(address()); }

    /** Sets the specified value to the {@code ndt} field. */
    public BGFXPlatformData ndt(@NativeType("void *") long value) { nndt(address(), value); return this; }
    /** Sets the specified value to the {@code nwh} field. */
    public BGFXPlatformData nwh(@NativeType("void *") long value) { nnwh(address(), value); return this; }
    /** Sets the specified value to the {@code context} field. */
    public BGFXPlatformData context(@NativeType("void *") long value) { ncontext(address(), value); return this; }
    /** Sets the specified value to the {@code backBuffer} field. */
    public BGFXPlatformData backBuffer(@NativeType("void *") long value) { nbackBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code backBufferDS} field. */
    public BGFXPlatformData backBufferDS(@NativeType("void *") long value) { nbackBufferDS(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXPlatformData set(
        long ndt,
        long nwh,
        long context,
        long backBuffer,
        long backBufferDS
    ) {
        ndt(ndt);
        nwh(nwh);
        context(context);
        backBuffer(backBuffer);
        backBufferDS(backBufferDS);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXPlatformData set(BGFXPlatformData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXPlatformData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXPlatformData malloc() {
        return wrap(BGFXPlatformData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXPlatformData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXPlatformData calloc() {
        return wrap(BGFXPlatformData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXPlatformData} instance allocated with {@link BufferUtils}. */
    public static BGFXPlatformData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXPlatformData.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXPlatformData} instance for the specified memory address. */
    public static BGFXPlatformData create(long address) {
        return wrap(BGFXPlatformData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXPlatformData createSafe(long address) {
        return address == NULL ? null : wrap(BGFXPlatformData.class, address);
    }

    // -----------------------------------

    /** Returns a new {@code BGFXPlatformData} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXPlatformData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BGFXPlatformData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXPlatformData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BGFXPlatformData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXPlatformData mallocStack(MemoryStack stack) {
        return wrap(BGFXPlatformData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXPlatformData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXPlatformData callocStack(MemoryStack stack) {
        return wrap(BGFXPlatformData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #ndt}. */
    public static long nndt(long struct) { return memGetAddress(struct + BGFXPlatformData.NDT); }
    /** Unsafe version of {@link #nwh}. */
    public static long nnwh(long struct) { return memGetAddress(struct + BGFXPlatformData.NWH); }
    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + BGFXPlatformData.CONTEXT); }
    /** Unsafe version of {@link #backBuffer}. */
    public static long nbackBuffer(long struct) { return memGetAddress(struct + BGFXPlatformData.BACKBUFFER); }
    /** Unsafe version of {@link #backBufferDS}. */
    public static long nbackBufferDS(long struct) { return memGetAddress(struct + BGFXPlatformData.BACKBUFFERDS); }

    /** Unsafe version of {@link #ndt(long) ndt}. */
    public static void nndt(long struct, long value) { memPutAddress(struct + BGFXPlatformData.NDT, value); }
    /** Unsafe version of {@link #nwh(long) nwh}. */
    public static void nnwh(long struct, long value) { memPutAddress(struct + BGFXPlatformData.NWH, value); }
    /** Unsafe version of {@link #context(long) context}. */
    public static void ncontext(long struct, long value) { memPutAddress(struct + BGFXPlatformData.CONTEXT, value); }
    /** Unsafe version of {@link #backBuffer(long) backBuffer}. */
    public static void nbackBuffer(long struct, long value) { memPutAddress(struct + BGFXPlatformData.BACKBUFFER, value); }
    /** Unsafe version of {@link #backBufferDS(long) backBufferDS}. */
    public static void nbackBufferDS(long struct, long value) { memPutAddress(struct + BGFXPlatformData.BACKBUFFERDS, value); }

}
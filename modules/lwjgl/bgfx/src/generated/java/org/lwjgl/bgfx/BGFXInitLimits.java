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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code maxEncoders} &ndash; maximum number of encoder threads</li>
 * <li>{@code transientVbSize} &ndash; maximum transient vertex buffer size</li>
 * <li>{@code transientIbSize} &ndash; maximum transient index buffer size</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_init_limits_t {
 *     uint16_t maxEncoders;
 *     uint32_t transientVbSize;
 *     uint32_t transientIbSize;
 * }</code></pre>
 */
@NativeType("struct bgfx_init_limits_t")
public class BGFXInitLimits extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXENCODERS,
        TRANSIENTVBSIZE,
        TRANSIENTIBSIZE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXENCODERS = layout.offsetof(0);
        TRANSIENTVBSIZE = layout.offsetof(1);
        TRANSIENTIBSIZE = layout.offsetof(2);
    }

    /**
     * Creates a {@code BGFXInitLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXInitLimits(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code maxEncoders} field. */
    @NativeType("uint16_t")
    public short maxEncoders() { return nmaxEncoders(address()); }
    /** Returns the value of the {@code transientVbSize} field. */
    @NativeType("uint32_t")
    public int transientVbSize() { return ntransientVbSize(address()); }
    /** Returns the value of the {@code transientIbSize} field. */
    @NativeType("uint32_t")
    public int transientIbSize() { return ntransientIbSize(address()); }

    /** Sets the specified value to the {@code maxEncoders} field. */
    public BGFXInitLimits maxEncoders(@NativeType("uint16_t") short value) { nmaxEncoders(address(), value); return this; }
    /** Sets the specified value to the {@code transientVbSize} field. */
    public BGFXInitLimits transientVbSize(@NativeType("uint32_t") int value) { ntransientVbSize(address(), value); return this; }
    /** Sets the specified value to the {@code transientIbSize} field. */
    public BGFXInitLimits transientIbSize(@NativeType("uint32_t") int value) { ntransientIbSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXInitLimits set(
        short maxEncoders,
        int transientVbSize,
        int transientIbSize
    ) {
        maxEncoders(maxEncoders);
        transientVbSize(transientVbSize);
        transientIbSize(transientIbSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXInitLimits set(BGFXInitLimits src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXInitLimits} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXInitLimits malloc() {
        return wrap(BGFXInitLimits.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXInitLimits} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXInitLimits calloc() {
        return wrap(BGFXInitLimits.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXInitLimits} instance allocated with {@link BufferUtils}. */
    public static BGFXInitLimits create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXInitLimits.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXInitLimits} instance for the specified memory address. */
    public static BGFXInitLimits create(long address) {
        return wrap(BGFXInitLimits.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXInitLimits createSafe(long address) {
        return address == NULL ? null : wrap(BGFXInitLimits.class, address);
    }

    // -----------------------------------

    /** Returns a new {@code BGFXInitLimits} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXInitLimits mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BGFXInitLimits} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXInitLimits callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BGFXInitLimits} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInitLimits mallocStack(MemoryStack stack) {
        return wrap(BGFXInitLimits.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXInitLimits} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInitLimits callocStack(MemoryStack stack) {
        return wrap(BGFXInitLimits.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxEncoders}. */
    public static short nmaxEncoders(long struct) { return UNSAFE.getShort(null, struct + BGFXInitLimits.MAXENCODERS); }
    /** Unsafe version of {@link #transientVbSize}. */
    public static int ntransientVbSize(long struct) { return UNSAFE.getInt(null, struct + BGFXInitLimits.TRANSIENTVBSIZE); }
    /** Unsafe version of {@link #transientIbSize}. */
    public static int ntransientIbSize(long struct) { return UNSAFE.getInt(null, struct + BGFXInitLimits.TRANSIENTIBSIZE); }

    /** Unsafe version of {@link #maxEncoders(short) maxEncoders}. */
    public static void nmaxEncoders(long struct, short value) { UNSAFE.putShort(null, struct + BGFXInitLimits.MAXENCODERS, value); }
    /** Unsafe version of {@link #transientVbSize(int) transientVbSize}. */
    public static void ntransientVbSize(long struct, int value) { UNSAFE.putInt(null, struct + BGFXInitLimits.TRANSIENTVBSIZE, value); }
    /** Unsafe version of {@link #transientIbSize(int) transientIbSize}. */
    public static void ntransientIbSize(long struct, int value) { UNSAFE.putInt(null, struct + BGFXInitLimits.TRANSIENTIBSIZE, value); }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_ScreenshotProgress_t {
 *     float progress;
 * }</code></pre>
 */
@NativeType("struct VREvent_ScreenshotProgress_t")
public class VREventScreenshotProgress extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROGRESS;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROGRESS = layout.offsetof(0);
    }

    /**
     * Creates a {@code VREventScreenshotProgress} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScreenshotProgress(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code progress} field. */
    public float progress() { return nprogress(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventScreenshotProgress} instance for the specified memory address. */
    public static VREventScreenshotProgress create(long address) {
        return wrap(VREventScreenshotProgress.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventScreenshotProgress createSafe(long address) {
        return address == NULL ? null : wrap(VREventScreenshotProgress.class, address);
    }

    /**
     * Create a {@link VREventScreenshotProgress.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventScreenshotProgress.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventScreenshotProgress.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #progress}. */
    public static float nprogress(long struct) { return UNSAFE.getFloat(null, struct + VREventScreenshotProgress.PROGRESS); }

    // -----------------------------------

    /** An array of {@link VREventScreenshotProgress} structs. */
    public static class Buffer extends StructBuffer<VREventScreenshotProgress, Buffer> {

        private static final VREventScreenshotProgress ELEMENT_FACTORY = VREventScreenshotProgress.create(-1L);

        /**
         * Creates a new {@code VREventScreenshotProgress.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScreenshotProgress#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VREventScreenshotProgress getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code progress} field. */
        public float progress() { return VREventScreenshotProgress.nprogress(address()); }

    }

}
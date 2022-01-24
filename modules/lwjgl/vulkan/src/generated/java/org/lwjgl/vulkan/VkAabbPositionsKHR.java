/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying two opposing corners of an axis-aligned bounding box.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code minX} <b>must</b> be less than or equal to {@code maxX}</li>
 * <li>{@code minY} <b>must</b> be less than or equal to {@code maxY}</li>
 * <li>{@code minZ} <b>must</b> be less than or equal to {@code maxZ}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAabbPositionsKHR {
 *     float {@link #minX};
 *     float {@link #minY};
 *     float {@link #minZ};
 *     float {@link #maxX};
 *     float {@link #maxY};
 *     float {@link #maxZ};
 * }</code></pre>
 */
public class VkAabbPositionsKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MINX,
        MINY,
        MINZ,
        MAXX,
        MAXY,
        MAXZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MINX = layout.offsetof(0);
        MINY = layout.offsetof(1);
        MINZ = layout.offsetof(2);
        MAXX = layout.offsetof(3);
        MAXY = layout.offsetof(4);
        MAXZ = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkAabbPositionsKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAabbPositionsKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the x position of one opposing corner of a bounding box. */
    public float minX() { return nminX(address()); }
    /** the y position of one opposing corner of a bounding box. */
    public float minY() { return nminY(address()); }
    /** the z position of one opposing corner of a bounding box. */
    public float minZ() { return nminZ(address()); }
    /** the x position of the other opposing corner of a bounding box. */
    public float maxX() { return nmaxX(address()); }
    /** the y position of the other opposing corner of a bounding box. */
    public float maxY() { return nmaxY(address()); }
    /** the z position of the other opposing corner of a bounding box. */
    public float maxZ() { return nmaxZ(address()); }

    /** Sets the specified value to the {@link #minX} field. */
    public VkAabbPositionsKHR minX(float value) { nminX(address(), value); return this; }
    /** Sets the specified value to the {@link #minY} field. */
    public VkAabbPositionsKHR minY(float value) { nminY(address(), value); return this; }
    /** Sets the specified value to the {@link #minZ} field. */
    public VkAabbPositionsKHR minZ(float value) { nminZ(address(), value); return this; }
    /** Sets the specified value to the {@link #maxX} field. */
    public VkAabbPositionsKHR maxX(float value) { nmaxX(address(), value); return this; }
    /** Sets the specified value to the {@link #maxY} field. */
    public VkAabbPositionsKHR maxY(float value) { nmaxY(address(), value); return this; }
    /** Sets the specified value to the {@link #maxZ} field. */
    public VkAabbPositionsKHR maxZ(float value) { nmaxZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAabbPositionsKHR set(
        float minX,
        float minY,
        float minZ,
        float maxX,
        float maxY,
        float maxZ
    ) {
        minX(minX);
        minY(minY);
        minZ(minZ);
        maxX(maxX);
        maxY(maxY);
        maxZ(maxZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAabbPositionsKHR set(VkAabbPositionsKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAabbPositionsKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAabbPositionsKHR malloc() {
        return wrap(VkAabbPositionsKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAabbPositionsKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAabbPositionsKHR calloc() {
        return wrap(VkAabbPositionsKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAabbPositionsKHR} instance allocated with {@link BufferUtils}. */
    public static VkAabbPositionsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAabbPositionsKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAabbPositionsKHR} instance for the specified memory address. */
    public static VkAabbPositionsKHR create(long address) {
        return wrap(VkAabbPositionsKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAabbPositionsKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkAabbPositionsKHR.class, address);
    }

    /**
     * Returns a new {@link VkAabbPositionsKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAabbPositionsKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAabbPositionsKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAabbPositionsKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAabbPositionsKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkAabbPositionsKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAabbPositionsKHR malloc(MemoryStack stack) {
        return wrap(VkAabbPositionsKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAabbPositionsKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAabbPositionsKHR calloc(MemoryStack stack) {
        return wrap(VkAabbPositionsKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAabbPositionsKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAabbPositionsKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAabbPositionsKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #minX}. */
    public static float nminX(long struct) { return UNSAFE.getFloat(null, struct + VkAabbPositionsKHR.MINX); }
    /** Unsafe version of {@link #minY}. */
    public static float nminY(long struct) { return UNSAFE.getFloat(null, struct + VkAabbPositionsKHR.MINY); }
    /** Unsafe version of {@link #minZ}. */
    public static float nminZ(long struct) { return UNSAFE.getFloat(null, struct + VkAabbPositionsKHR.MINZ); }
    /** Unsafe version of {@link #maxX}. */
    public static float nmaxX(long struct) { return UNSAFE.getFloat(null, struct + VkAabbPositionsKHR.MAXX); }
    /** Unsafe version of {@link #maxY}. */
    public static float nmaxY(long struct) { return UNSAFE.getFloat(null, struct + VkAabbPositionsKHR.MAXY); }
    /** Unsafe version of {@link #maxZ}. */
    public static float nmaxZ(long struct) { return UNSAFE.getFloat(null, struct + VkAabbPositionsKHR.MAXZ); }

    /** Unsafe version of {@link #minX(float) minX}. */
    public static void nminX(long struct, float value) { UNSAFE.putFloat(null, struct + VkAabbPositionsKHR.MINX, value); }
    /** Unsafe version of {@link #minY(float) minY}. */
    public static void nminY(long struct, float value) { UNSAFE.putFloat(null, struct + VkAabbPositionsKHR.MINY, value); }
    /** Unsafe version of {@link #minZ(float) minZ}. */
    public static void nminZ(long struct, float value) { UNSAFE.putFloat(null, struct + VkAabbPositionsKHR.MINZ, value); }
    /** Unsafe version of {@link #maxX(float) maxX}. */
    public static void nmaxX(long struct, float value) { UNSAFE.putFloat(null, struct + VkAabbPositionsKHR.MAXX, value); }
    /** Unsafe version of {@link #maxY(float) maxY}. */
    public static void nmaxY(long struct, float value) { UNSAFE.putFloat(null, struct + VkAabbPositionsKHR.MAXY, value); }
    /** Unsafe version of {@link #maxZ(float) maxZ}. */
    public static void nmaxZ(long struct, float value) { UNSAFE.putFloat(null, struct + VkAabbPositionsKHR.MAXZ, value); }

    // -----------------------------------

    /** An array of {@link VkAabbPositionsKHR} structs. */
    public static class Buffer extends StructBuffer<VkAabbPositionsKHR, Buffer> implements NativeResource {

        private static final VkAabbPositionsKHR ELEMENT_FACTORY = VkAabbPositionsKHR.create(-1L);

        /**
         * Creates a new {@code VkAabbPositionsKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAabbPositionsKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkAabbPositionsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAabbPositionsKHR#minX} field. */
        public float minX() { return VkAabbPositionsKHR.nminX(address()); }
        /** @return the value of the {@link VkAabbPositionsKHR#minY} field. */
        public float minY() { return VkAabbPositionsKHR.nminY(address()); }
        /** @return the value of the {@link VkAabbPositionsKHR#minZ} field. */
        public float minZ() { return VkAabbPositionsKHR.nminZ(address()); }
        /** @return the value of the {@link VkAabbPositionsKHR#maxX} field. */
        public float maxX() { return VkAabbPositionsKHR.nmaxX(address()); }
        /** @return the value of the {@link VkAabbPositionsKHR#maxY} field. */
        public float maxY() { return VkAabbPositionsKHR.nmaxY(address()); }
        /** @return the value of the {@link VkAabbPositionsKHR#maxZ} field. */
        public float maxZ() { return VkAabbPositionsKHR.nmaxZ(address()); }

        /** Sets the specified value to the {@link VkAabbPositionsKHR#minX} field. */
        public VkAabbPositionsKHR.Buffer minX(float value) { VkAabbPositionsKHR.nminX(address(), value); return this; }
        /** Sets the specified value to the {@link VkAabbPositionsKHR#minY} field. */
        public VkAabbPositionsKHR.Buffer minY(float value) { VkAabbPositionsKHR.nminY(address(), value); return this; }
        /** Sets the specified value to the {@link VkAabbPositionsKHR#minZ} field. */
        public VkAabbPositionsKHR.Buffer minZ(float value) { VkAabbPositionsKHR.nminZ(address(), value); return this; }
        /** Sets the specified value to the {@link VkAabbPositionsKHR#maxX} field. */
        public VkAabbPositionsKHR.Buffer maxX(float value) { VkAabbPositionsKHR.nmaxX(address(), value); return this; }
        /** Sets the specified value to the {@link VkAabbPositionsKHR#maxY} field. */
        public VkAabbPositionsKHR.Buffer maxY(float value) { VkAabbPositionsKHR.nmaxY(address(), value); return this; }
        /** Sets the specified value to the {@link VkAabbPositionsKHR#maxZ} field. */
        public VkAabbPositionsKHR.Buffer maxZ(float value) { VkAabbPositionsKHR.nmaxZ(address(), value); return this; }

    }

}
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
 * Properties of the physical device for raytracing.
 * 
 * <h5>Description</h5>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAYTRACING_PROPERTIES_NVX STRUCTURE_TYPE_PHYSICAL_DEVICE_RAYTRACING_PROPERTIES_NVX}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code shaderHeaderSize} &ndash; size in bytes of the shader header.</li>
 * <li>{@code maxRecursionDepth} &ndash; the maximum number of levels of recursion allowed in a trace command.</li>
 * <li>{@code maxGeometryCount} &ndash; the maximum number of geometries in the bottom level acceleration structure.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRaytracingPropertiesNVX {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t shaderHeaderSize;
 *     uint32_t maxRecursionDepth;
 *     uint32_t maxGeometryCount;
 * }</code></pre>
 */
public class VkPhysicalDeviceRaytracingPropertiesNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERHEADERSIZE,
        MAXRECURSIONDEPTH,
        MAXGEOMETRYCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERHEADERSIZE = layout.offsetof(2);
        MAXRECURSIONDEPTH = layout.offsetof(3);
        MAXGEOMETRYCOUNT = layout.offsetof(4);
    }

    /**
     * Creates a {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRaytracingPropertiesNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shaderHeaderSize} field. */
    @NativeType("uint32_t")
    public int shaderHeaderSize() { return nshaderHeaderSize(address()); }
    /** Returns the value of the {@code maxRecursionDepth} field. */
    @NativeType("uint32_t")
    public int maxRecursionDepth() { return nmaxRecursionDepth(address()); }
    /** Returns the value of the {@code maxGeometryCount} field. */
    @NativeType("uint32_t")
    public int maxGeometryCount() { return nmaxGeometryCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRaytracingPropertiesNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRaytracingPropertiesNVX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderHeaderSize} field. */
    public VkPhysicalDeviceRaytracingPropertiesNVX shaderHeaderSize(@NativeType("uint32_t") int value) { nshaderHeaderSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxRecursionDepth} field. */
    public VkPhysicalDeviceRaytracingPropertiesNVX maxRecursionDepth(@NativeType("uint32_t") int value) { nmaxRecursionDepth(address(), value); return this; }
    /** Sets the specified value to the {@code maxGeometryCount} field. */
    public VkPhysicalDeviceRaytracingPropertiesNVX maxGeometryCount(@NativeType("uint32_t") int value) { nmaxGeometryCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRaytracingPropertiesNVX set(
        int sType,
        long pNext,
        int shaderHeaderSize,
        int maxRecursionDepth,
        int maxGeometryCount
    ) {
        sType(sType);
        pNext(pNext);
        shaderHeaderSize(shaderHeaderSize);
        maxRecursionDepth(maxRecursionDepth);
        maxGeometryCount(maxGeometryCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRaytracingPropertiesNVX set(VkPhysicalDeviceRaytracingPropertiesNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRaytracingPropertiesNVX malloc() {
        return wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRaytracingPropertiesNVX calloc() {
        return wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRaytracingPropertiesNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, memAddress(container), container);
    }

    /** Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance for the specified memory address. */
    public static VkPhysicalDeviceRaytracingPropertiesNVX create(long address) {
        return wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRaytracingPropertiesNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceRaytracingPropertiesNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceRaytracingPropertiesNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceRaytracingPropertiesNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRaytracingPropertiesNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRaytracingPropertiesNVX.PNEXT); }
    /** Unsafe version of {@link #shaderHeaderSize}. */
    public static int nshaderHeaderSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.SHADERHEADERSIZE); }
    /** Unsafe version of {@link #maxRecursionDepth}. */
    public static int nmaxRecursionDepth(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.MAXRECURSIONDEPTH); }
    /** Unsafe version of {@link #maxGeometryCount}. */
    public static int nmaxGeometryCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.MAXGEOMETRYCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRaytracingPropertiesNVX.PNEXT, value); }
    /** Unsafe version of {@link #shaderHeaderSize(int) shaderHeaderSize}. */
    public static void nshaderHeaderSize(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.SHADERHEADERSIZE, value); }
    /** Unsafe version of {@link #maxRecursionDepth(int) maxRecursionDepth}. */
    public static void nmaxRecursionDepth(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.MAXRECURSIONDEPTH, value); }
    /** Unsafe version of {@link #maxGeometryCount(int) maxGeometryCount}. */
    public static void nmaxGeometryCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRaytracingPropertiesNVX.MAXGEOMETRYCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRaytracingPropertiesNVX} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRaytracingPropertiesNVX, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRaytracingPropertiesNVX ELEMENT_FACTORY = VkPhysicalDeviceRaytracingPropertiesNVX.create(-1L);

        /**
         * Creates a new {@link VkPhysicalDeviceRaytracingPropertiesNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRaytracingPropertiesNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceRaytracingPropertiesNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRaytracingPropertiesNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRaytracingPropertiesNVX.npNext(address()); }
        /** Returns the value of the {@code shaderHeaderSize} field. */
        @NativeType("uint32_t")
        public int shaderHeaderSize() { return VkPhysicalDeviceRaytracingPropertiesNVX.nshaderHeaderSize(address()); }
        /** Returns the value of the {@code maxRecursionDepth} field. */
        @NativeType("uint32_t")
        public int maxRecursionDepth() { return VkPhysicalDeviceRaytracingPropertiesNVX.nmaxRecursionDepth(address()); }
        /** Returns the value of the {@code maxGeometryCount} field. */
        @NativeType("uint32_t")
        public int maxGeometryCount() { return VkPhysicalDeviceRaytracingPropertiesNVX.nmaxGeometryCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRaytracingPropertiesNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRaytracingPropertiesNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRaytracingPropertiesNVX.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRaytracingPropertiesNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderHeaderSize} field. */
        public VkPhysicalDeviceRaytracingPropertiesNVX.Buffer shaderHeaderSize(@NativeType("uint32_t") int value) { VkPhysicalDeviceRaytracingPropertiesNVX.nshaderHeaderSize(address(), value); return this; }
        /** Sets the specified value to the {@code maxRecursionDepth} field. */
        public VkPhysicalDeviceRaytracingPropertiesNVX.Buffer maxRecursionDepth(@NativeType("uint32_t") int value) { VkPhysicalDeviceRaytracingPropertiesNVX.nmaxRecursionDepth(address(), value); return this; }
        /** Sets the specified value to the {@code maxGeometryCount} field. */
        public VkPhysicalDeviceRaytracingPropertiesNVX.Buffer maxGeometryCount(@NativeType("uint32_t") int value) { VkPhysicalDeviceRaytracingPropertiesNVX.nmaxGeometryCount(address(), value); return this; }

    }

}
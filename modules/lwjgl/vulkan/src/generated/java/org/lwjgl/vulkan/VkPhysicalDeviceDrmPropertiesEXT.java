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
 * Structure containing DRM information of a physical device.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDrmPropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>These are properties of the DRM information of a physical device.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPhysicalDeviceDrm#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDrmPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #hasPrimary};
 *     VkBool32 {@link #hasRender};
 *     int64_t {@link #primaryMajor};
 *     int64_t {@link #primaryMinor};
 *     int64_t {@link #renderMajor};
 *     int64_t {@link #renderMinor};
 * }</code></pre>
 */
public class VkPhysicalDeviceDrmPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HASPRIMARY,
        HASRENDER,
        PRIMARYMAJOR,
        PRIMARYMINOR,
        RENDERMAJOR,
        RENDERMINOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HASPRIMARY = layout.offsetof(2);
        HASRENDER = layout.offsetof(3);
        PRIMARYMAJOR = layout.offsetof(4);
        PRIMARYMINOR = layout.offsetof(5);
        RENDERMAJOR = layout.offsetof(6);
        RENDERMINOR = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDrmPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDrmPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a boolean indicating whether the physical device has a DRM primary node. */
    @NativeType("VkBool32")
    public boolean hasPrimary() { return nhasPrimary(address()) != 0; }
    /** a boolean indicating whether the physical device has a DRM render node. */
    @NativeType("VkBool32")
    public boolean hasRender() { return nhasRender(address()) != 0; }
    /** the DRM primary node major number, if any. */
    @NativeType("int64_t")
    public long primaryMajor() { return nprimaryMajor(address()); }
    /** the DRM primary node minor number, if any. */
    @NativeType("int64_t")
    public long primaryMinor() { return nprimaryMinor(address()); }
    /** the DRM render node major number, if any. */
    @NativeType("int64_t")
    public long renderMajor() { return nrenderMajor(address()); }
    /** the DRM render node minor number, if any. */
    @NativeType("int64_t")
    public long renderMinor() { return nrenderMinor(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDrmPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPhysicalDeviceDrm#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDrmPropertiesEXT sType$Default() { return sType(EXTPhysicalDeviceDrm.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDrmPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDrmPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDrmPropertiesEXT set(VkPhysicalDeviceDrmPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDrmPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDrmPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceDrmPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDrmPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDrmPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceDrmPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDrmPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDrmPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDrmPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDrmPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDrmPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceDrmPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDrmPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDrmPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDrmPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDrmPropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDrmPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDrmPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDrmPropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDrmPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDrmPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDrmPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDrmPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #hasPrimary}. */
    public static int nhasPrimary(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDrmPropertiesEXT.HASPRIMARY); }
    /** Unsafe version of {@link #hasRender}. */
    public static int nhasRender(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDrmPropertiesEXT.HASRENDER); }
    /** Unsafe version of {@link #primaryMajor}. */
    public static long nprimaryMajor(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDrmPropertiesEXT.PRIMARYMAJOR); }
    /** Unsafe version of {@link #primaryMinor}. */
    public static long nprimaryMinor(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDrmPropertiesEXT.PRIMARYMINOR); }
    /** Unsafe version of {@link #renderMajor}. */
    public static long nrenderMajor(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDrmPropertiesEXT.RENDERMAJOR); }
    /** Unsafe version of {@link #renderMinor}. */
    public static long nrenderMinor(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceDrmPropertiesEXT.RENDERMINOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDrmPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDrmPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDrmPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDrmPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDrmPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDrmPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDrmPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDrmPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDrmPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDrmPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDrmPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#hasPrimary} field. */
        @NativeType("VkBool32")
        public boolean hasPrimary() { return VkPhysicalDeviceDrmPropertiesEXT.nhasPrimary(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#hasRender} field. */
        @NativeType("VkBool32")
        public boolean hasRender() { return VkPhysicalDeviceDrmPropertiesEXT.nhasRender(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#primaryMajor} field. */
        @NativeType("int64_t")
        public long primaryMajor() { return VkPhysicalDeviceDrmPropertiesEXT.nprimaryMajor(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#primaryMinor} field. */
        @NativeType("int64_t")
        public long primaryMinor() { return VkPhysicalDeviceDrmPropertiesEXT.nprimaryMinor(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#renderMajor} field. */
        @NativeType("int64_t")
        public long renderMajor() { return VkPhysicalDeviceDrmPropertiesEXT.nrenderMajor(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDrmPropertiesEXT#renderMinor} field. */
        @NativeType("int64_t")
        public long renderMinor() { return VkPhysicalDeviceDrmPropertiesEXT.nrenderMinor(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceDrmPropertiesEXT#sType} field. */
        public VkPhysicalDeviceDrmPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDrmPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPhysicalDeviceDrm#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceDrmPropertiesEXT#sType} field. */
        public VkPhysicalDeviceDrmPropertiesEXT.Buffer sType$Default() { return sType(EXTPhysicalDeviceDrm.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDrmPropertiesEXT#pNext} field. */
        public VkPhysicalDeviceDrmPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDrmPropertiesEXT.npNext(address(), value); return this; }

    }

}
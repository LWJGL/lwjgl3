/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing display native HDR specific capabilities of a surface.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDDisplayNativeHdr#VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayNativeHdrSurfaceCapabilitiesAMD {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #localDimmingSupport};
 * }</code></pre>
 */
public class VkDisplayNativeHdrSurfaceCapabilitiesAMD extends Struct<VkDisplayNativeHdrSurfaceCapabilitiesAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LOCALDIMMINGSUPPORT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LOCALDIMMINGSUPPORT = layout.offsetof(2);
    }

    protected VkDisplayNativeHdrSurfaceCapabilitiesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayNativeHdrSurfaceCapabilitiesAMD create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(address, container);
    }

    /**
     * Creates a {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether the surface supports local dimming. If this is {@link VK10#VK_TRUE TRUE}, {@link VkSwapchainDisplayNativeHdrCreateInfoAMD} <b>can</b> be used to explicitly enable or disable local dimming for the surface. Local dimming may also be overridden by {@link AMDDisplayNativeHdr#vkSetLocalDimmingAMD SetLocalDimmingAMD} during the lifetime of the swapchain. */
    @NativeType("VkBool32")
    public boolean localDimmingSupport() { return nlocalDimmingSupport(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDDisplayNativeHdr#VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD} value to the {@link #sType} field. */
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD sType$Default() { return sType(AMDDisplayNativeHdr.VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD set(
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
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD set(VkDisplayNativeHdrSurfaceCapabilitiesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD malloc() {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD calloc() {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated with {@link BufferUtils}. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance for the specified memory address. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD create(long address) {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayNativeHdrSurfaceCapabilitiesAMD createSafe(long address) {
        return address == NULL ? null : new VkDisplayNativeHdrSurfaceCapabilitiesAMD(address, null);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD malloc(MemoryStack stack) {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD calloc(MemoryStack stack) {
        return new VkDisplayNativeHdrSurfaceCapabilitiesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.PNEXT); }
    /** Unsafe version of {@link #localDimmingSupport}. */
    public static int nlocalDimmingSupport(long struct) { return memGetInt(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.LOCALDIMMINGSUPPORT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkDisplayNativeHdrSurfaceCapabilitiesAMD, Buffer> implements NativeResource {

        private static final VkDisplayNativeHdrSurfaceCapabilitiesAMD ELEMENT_FACTORY = VkDisplayNativeHdrSurfaceCapabilitiesAMD.create(-1L);

        /**
         * Creates a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkDisplayNativeHdrSurfaceCapabilitiesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayNativeHdrSurfaceCapabilitiesAMD.nsType(address()); }
        /** @return the value of the {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDisplayNativeHdrSurfaceCapabilitiesAMD.npNext(address()); }
        /** @return the value of the {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#localDimmingSupport} field. */
        @NativeType("VkBool32")
        public boolean localDimmingSupport() { return VkDisplayNativeHdrSurfaceCapabilitiesAMD.nlocalDimmingSupport(address()) != 0; }

        /** Sets the specified value to the {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#sType} field. */
        public VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayNativeHdrSurfaceCapabilitiesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDDisplayNativeHdr#VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD} value to the {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#sType} field. */
        public VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer sType$Default() { return sType(AMDDisplayNativeHdr.VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD); }
        /** Sets the specified value to the {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#pNext} field. */
        public VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer pNext(@NativeType("void *") long value) { VkDisplayNativeHdrSurfaceCapabilitiesAMD.npNext(address(), value); return this; }

    }

}
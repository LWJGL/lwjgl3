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
 * Structure describing display native HDR specific capabilities of a surface.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDDisplayNativeHdr#VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code localDimmingSupport} &ndash; specifies whether the surface supports local dimming. If this is {@link VK10#VK_TRUE TRUE}, {@link VkSwapchainDisplayNativeHdrCreateInfoAMD} <b>can</b> be used to explicitly enable or disable local dimming for the surface. Local dimming may also be overriden by {@link AMDDisplayNativeHdr#vkSetLocalDimmingAMD SetLocalDimmingAMD} during the lifetime of the swapchain.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayNativeHdrSurfaceCapabilitiesAMD {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 localDimmingSupport;
 * }</code></pre>
 */
public class VkDisplayNativeHdrSurfaceCapabilitiesAMD extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code localDimmingSupport} field. */
    @NativeType("VkBool32")
    public boolean localDimmingSupport() { return nlocalDimmingSupport(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayNativeHdrSurfaceCapabilitiesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
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
        return wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD calloc() {
        return wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated with {@link BufferUtils}. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance for the specified memory address. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD create(long address) {
        return wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, address);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD mallocStack(MemoryStack stack) {
        return wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD callocStack(MemoryStack stack) {
        return wrap(VkDisplayNativeHdrSurfaceCapabilitiesAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.PNEXT); }
    /** Unsafe version of {@link #localDimmingSupport}. */
    public static int nlocalDimmingSupport(long struct) { return UNSAFE.getInt(null, struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.LOCALDIMMINGSUPPORT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayNativeHdrSurfaceCapabilitiesAMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkDisplayNativeHdrSurfaceCapabilitiesAMD, Buffer> implements NativeResource {

        private static final VkDisplayNativeHdrSurfaceCapabilitiesAMD ELEMENT_FACTORY = VkDisplayNativeHdrSurfaceCapabilitiesAMD.create(-1L);

        /**
         * Creates a new {@code VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkDisplayNativeHdrSurfaceCapabilitiesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayNativeHdrSurfaceCapabilitiesAMD.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDisplayNativeHdrSurfaceCapabilitiesAMD.npNext(address()); }
        /** Returns the value of the {@code localDimmingSupport} field. */
        @NativeType("VkBool32")
        public boolean localDimmingSupport() { return VkDisplayNativeHdrSurfaceCapabilitiesAMD.nlocalDimmingSupport(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayNativeHdrSurfaceCapabilitiesAMD.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayNativeHdrSurfaceCapabilitiesAMD.Buffer pNext(@NativeType("void *") long value) { VkDisplayNativeHdrSurfaceCapabilitiesAMD.npNext(address(), value); return this; }

    }

}
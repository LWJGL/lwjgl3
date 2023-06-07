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
 * Structure describing shader module identifier properties of an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Because the extension changes how hits are managed there is a compatibility reason to expose the extension even when an implementation does not have sorting active.</p>
 * </div>
 * 
 * <p>If the {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkRayTracingInvocationReorderModeNV {@link #rayTracingInvocationReorderReorderingHint};
 * }</code></pre>
 */
public class VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV extends Struct<VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RAYTRACINGINVOCATIONREORDERREORDERINGHINT;

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
        RAYTRACINGINVOCATIONREORDERREORDERINGHINT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a hint indicating if the implementation will actually reorder at the reorder calls. */
    @NativeType("VkRayTracingInvocationReorderModeNV")
    public int rayTracingInvocationReorderReorderingHint() { return nrayTracingInvocationReorderReorderingHint(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV sType$Default() { return sType(NVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV set(
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
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV set(VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV malloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV calloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV create(long address) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #rayTracingInvocationReorderReorderingHint}. */
    public static int nrayTracingInvocationReorderReorderingHint(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.RAYTRACINGINVOCATIONREORDERREORDERINGHINT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV#rayTracingInvocationReorderReorderingHint} field. */
        @NativeType("VkRayTracingInvocationReorderModeNV")
        public int rayTracingInvocationReorderReorderingHint() { return VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.nrayTracingInvocationReorderReorderingHint(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVRayTracingInvocationReorder#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer sType$Default() { return sType(NVRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV.npNext(address(), value); return this; }

    }

}
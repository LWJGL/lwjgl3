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
 * Structure describing the virtual allocation reporting feature supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceAddressBindingReport#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAddressBindingReportFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #reportAddressBinding};
 * }</code></pre>
 */
public class VkPhysicalDeviceAddressBindingReportFeaturesEXT extends Struct<VkPhysicalDeviceAddressBindingReportFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REPORTADDRESSBINDING;

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
        REPORTADDRESSBINDING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAddressBindingReportFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceAddressBindingReportFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether this implementation supports reporting the binding of GPU virtual address ranges to Vulkan objects. */
    @NativeType("VkBool32")
    public boolean reportAddressBinding() { return nreportAddressBinding(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceAddressBindingReport#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT sType$Default() { return sType(EXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #reportAddressBinding} field. */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT reportAddressBinding(@NativeType("VkBool32") boolean value) { nreportAddressBinding(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT set(
        int sType,
        long pNext,
        boolean reportAddressBinding
    ) {
        sType(sType);
        pNext(pNext);
        reportAddressBinding(reportAddressBinding);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAddressBindingReportFeaturesEXT set(VkPhysicalDeviceAddressBindingReportFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT malloc() {
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT calloc() {
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT create(long address) {
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceAddressBindingReportFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceAddressBindingReportFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAddressBindingReportFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceAddressBindingReportFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAddressBindingReportFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #reportAddressBinding}. */
    public static int nreportAddressBinding(long struct) { return memGetInt(struct + VkPhysicalDeviceAddressBindingReportFeaturesEXT.REPORTADDRESSBINDING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAddressBindingReportFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAddressBindingReportFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #reportAddressBinding(boolean) reportAddressBinding}. */
    public static void nreportAddressBinding(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAddressBindingReportFeaturesEXT.REPORTADDRESSBINDING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAddressBindingReportFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAddressBindingReportFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceAddressBindingReportFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceAddressBindingReportFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#reportAddressBinding} field. */
        @NativeType("VkBool32")
        public boolean reportAddressBinding() { return VkPhysicalDeviceAddressBindingReportFeaturesEXT.nreportAddressBinding(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#sType} field. */
        public VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceAddressBindingReport#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT} value to the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#sType} field. */
        public VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer sType$Default() { return sType(EXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ADDRESS_BINDING_REPORT_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAddressBindingReportFeaturesEXT#reportAddressBinding} field. */
        public VkPhysicalDeviceAddressBindingReportFeaturesEXT.Buffer reportAddressBinding(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAddressBindingReportFeaturesEXT.nreportAddressBinding(address(), value ? 1 : 0); return this; }

    }

}
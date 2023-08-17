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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying device fault information.
 * 
 * <h5>Description</h5>
 * 
 * <p>An implementation <b>should</b> populate as many members of {@link VkDeviceFaultInfoEXT} as possible, given the information available at the time of the fault and the constraints of the implementation itself.</p>
 * 
 * <p>Due to hardware limitations, {@code pAddressInfos} describes ranges of GPU virtual address space, rather than precise addresses. The precise memory address accessed or the precise value of the instruction pointer <b>must</b> lie within the region described.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Each element of {@code pAddressInfos} describes either:</p>
 * 
 * <ul>
 * <li>A memory access which may have triggered a page fault and may have contributed to device loss</li>
 * <li>The value of an active instruction pointer at the time a fault occurred. This value may be indicative of the active pipeline or shader at the time of device loss</li>
 * </ul>
 * 
 * <p>Comparison of the GPU virtual addresses described by {@code pAddressInfos} to GPU virtual address ranges reported by the {@link EXTDeviceAddressBindingReport VK_EXT_device_address_binding_report} extension may allow applications to correlate between these addresses and Vulkan objects. Applications should be aware that these addresses may also correspond to resources internal to an implementation, which will not be reported via the {@link EXTDeviceAddressBindingReport VK_EXT_device_address_binding_report} extension.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pAddressInfos} is not {@code NULL}, {@code pAddressInfos} <b>must</b> be a valid pointer to a {@link VkDeviceFaultAddressInfoEXT} structure</li>
 * <li>If {@code pVendorInfos} is not {@code NULL}, {@code pVendorInfos} <b>must</b> be a valid pointer to a {@link VkDeviceFaultVendorInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceFaultAddressInfoEXT}, {@link VkDeviceFaultVendorInfoEXT}, {@link EXTDeviceFault#vkGetDeviceFaultInfoEXT GetDeviceFaultInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceFaultInfoEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     {@link VkDeviceFaultAddressInfoEXT VkDeviceFaultAddressInfoEXT} * {@link #pAddressInfos};
 *     {@link VkDeviceFaultVendorInfoEXT VkDeviceFaultVendorInfoEXT} * {@link #pVendorInfos};
 *     void * {@link #pVendorBinaryData};
 * }</code></pre>
 */
public class VkDeviceFaultInfoEXT extends Struct<VkDeviceFaultInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTION,
        PADDRESSINFOS,
        PVENDORINFOS,
        PVENDORBINARYDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTION = layout.offsetof(2);
        PADDRESSINFOS = layout.offsetof(3);
        PVENDORINFOS = layout.offsetof(4);
        PVENDORBINARYDATA = layout.offsetof(5);
    }

    protected VkDeviceFaultInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceFaultInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceFaultInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceFaultInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceFaultInfoEXT(ByteBuffer container) {
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
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description of the fault. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description of the fault. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkDeviceFaultAddressInfoEXT} structures describing either memory accesses which <b>may</b> have caused a page fault, or describing active instruction pointers at the time of the fault. If not {@code NULL}, each element of {@code pAddressInfos} describes the a bounded region of GPU virtual address space containing either the GPU virtual address accessed, or the value of an active instruction pointer. */
    @Nullable
    @NativeType("VkDeviceFaultAddressInfoEXT *")
    public VkDeviceFaultAddressInfoEXT pAddressInfos() { return npAddressInfos(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkDeviceFaultVendorInfoEXT} structures describing vendor-specific fault information. */
    @Nullable
    @NativeType("VkDeviceFaultVendorInfoEXT *")
    public VkDeviceFaultVendorInfoEXT pVendorInfos() { return npVendorInfos(address()); }
    /** {@code NULL} or a pointer to {@code vendorBinarySize} number of bytes of data, which will be populated with a vendor-specific binary crash dump, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vendor-binary-crash-dumps">Vendor Binary Crash Dumps</a>. */
    @NativeType("void *")
    public long pVendorBinaryData() { return npVendorBinaryData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceFaultInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT} value to the {@link #sType} field. */
    public VkDeviceFaultInfoEXT sType$Default() { return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceFaultInfoEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #description} field. */
    public VkDeviceFaultInfoEXT description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { ndescription(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceFaultAddressInfoEXT} to the {@link #pAddressInfos} field. */
    public VkDeviceFaultInfoEXT pAddressInfos(@Nullable @NativeType("VkDeviceFaultAddressInfoEXT *") VkDeviceFaultAddressInfoEXT value) { npAddressInfos(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceFaultVendorInfoEXT} to the {@link #pVendorInfos} field. */
    public VkDeviceFaultInfoEXT pVendorInfos(@Nullable @NativeType("VkDeviceFaultVendorInfoEXT *") VkDeviceFaultVendorInfoEXT value) { npVendorInfos(address(), value); return this; }
    /** Sets the specified value to the {@link #pVendorBinaryData} field. */
    public VkDeviceFaultInfoEXT pVendorBinaryData(@NativeType("void *") long value) { npVendorBinaryData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceFaultInfoEXT set(
        int sType,
        long pNext,
        ByteBuffer description,
        @Nullable VkDeviceFaultAddressInfoEXT pAddressInfos,
        @Nullable VkDeviceFaultVendorInfoEXT pVendorInfos,
        long pVendorBinaryData
    ) {
        sType(sType);
        pNext(pNext);
        description(description);
        pAddressInfos(pAddressInfos);
        pVendorInfos(pVendorInfos);
        pVendorBinaryData(pVendorBinaryData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceFaultInfoEXT set(VkDeviceFaultInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceFaultInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultInfoEXT malloc() {
        return new VkDeviceFaultInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceFaultInfoEXT calloc() {
        return new VkDeviceFaultInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceFaultInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceFaultInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceFaultInfoEXT} instance for the specified memory address. */
    public static VkDeviceFaultInfoEXT create(long address) {
        return new VkDeviceFaultInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceFaultInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceFaultInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceFaultInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceFaultInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceFaultInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceFaultInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceFaultInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceFaultInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceFaultInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceFaultInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceFaultInfoEXT.PNEXT); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkDeviceFaultInfoEXT.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkDeviceFaultInfoEXT.DESCRIPTION); }
    /** Unsafe version of {@link #pAddressInfos}. */
    @Nullable public static VkDeviceFaultAddressInfoEXT npAddressInfos(long struct) { return VkDeviceFaultAddressInfoEXT.createSafe(memGetAddress(struct + VkDeviceFaultInfoEXT.PADDRESSINFOS)); }
    /** Unsafe version of {@link #pVendorInfos}. */
    @Nullable public static VkDeviceFaultVendorInfoEXT npVendorInfos(long struct) { return VkDeviceFaultVendorInfoEXT.createSafe(memGetAddress(struct + VkDeviceFaultInfoEXT.PVENDORINFOS)); }
    /** Unsafe version of {@link #pVendorBinaryData}. */
    public static long npVendorBinaryData(long struct) { return memGetAddress(struct + VkDeviceFaultInfoEXT.PVENDORBINARYDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceFaultInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceFaultInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VK_MAX_DESCRIPTION_SIZE);
        }
        memCopy(memAddress(value), struct + VkDeviceFaultInfoEXT.DESCRIPTION, value.remaining());
    }
    /** Unsafe version of {@link #pAddressInfos(VkDeviceFaultAddressInfoEXT) pAddressInfos}. */
    public static void npAddressInfos(long struct, @Nullable VkDeviceFaultAddressInfoEXT value) { memPutAddress(struct + VkDeviceFaultInfoEXT.PADDRESSINFOS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pVendorInfos(VkDeviceFaultVendorInfoEXT) pVendorInfos}. */
    public static void npVendorInfos(long struct, @Nullable VkDeviceFaultVendorInfoEXT value) { memPutAddress(struct + VkDeviceFaultInfoEXT.PVENDORINFOS, memAddressSafe(value)); }
    /** Unsafe version of {@link #pVendorBinaryData(long) pVendorBinaryData}. */
    public static void npVendorBinaryData(long struct, long value) { memPutAddress(struct + VkDeviceFaultInfoEXT.PVENDORBINARYDATA, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceFaultInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceFaultInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceFaultInfoEXT ELEMENT_FACTORY = VkDeviceFaultInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceFaultInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceFaultInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceFaultInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceFaultInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceFaultInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDeviceFaultInfoEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceFaultInfoEXT.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkDeviceFaultInfoEXT#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkDeviceFaultInfoEXT.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkDeviceFaultInfoEXT#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkDeviceFaultInfoEXT.ndescriptionString(address()); }
        /** @return a {@link VkDeviceFaultAddressInfoEXT} view of the struct pointed to by the {@link VkDeviceFaultInfoEXT#pAddressInfos} field. */
        @Nullable
        @NativeType("VkDeviceFaultAddressInfoEXT *")
        public VkDeviceFaultAddressInfoEXT pAddressInfos() { return VkDeviceFaultInfoEXT.npAddressInfos(address()); }
        /** @return a {@link VkDeviceFaultVendorInfoEXT} view of the struct pointed to by the {@link VkDeviceFaultInfoEXT#pVendorInfos} field. */
        @Nullable
        @NativeType("VkDeviceFaultVendorInfoEXT *")
        public VkDeviceFaultVendorInfoEXT pVendorInfos() { return VkDeviceFaultInfoEXT.npVendorInfos(address()); }
        /** @return the value of the {@link VkDeviceFaultInfoEXT#pVendorBinaryData} field. */
        @NativeType("void *")
        public long pVendorBinaryData() { return VkDeviceFaultInfoEXT.npVendorBinaryData(address()); }

        /** Sets the specified value to the {@link VkDeviceFaultInfoEXT#sType} field. */
        public VkDeviceFaultInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceFaultInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceFault#VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT} value to the {@link VkDeviceFaultInfoEXT#sType} field. */
        public VkDeviceFaultInfoEXT.Buffer sType$Default() { return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT); }
        /** Sets the specified value to the {@link VkDeviceFaultInfoEXT#pNext} field. */
        public VkDeviceFaultInfoEXT.Buffer pNext(@NativeType("void *") long value) { VkDeviceFaultInfoEXT.npNext(address(), value); return this; }
        /** Copies the specified encoded string to the {@link VkDeviceFaultInfoEXT#description} field. */
        public VkDeviceFaultInfoEXT.Buffer description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { VkDeviceFaultInfoEXT.ndescription(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceFaultAddressInfoEXT} to the {@link VkDeviceFaultInfoEXT#pAddressInfos} field. */
        public VkDeviceFaultInfoEXT.Buffer pAddressInfos(@Nullable @NativeType("VkDeviceFaultAddressInfoEXT *") VkDeviceFaultAddressInfoEXT value) { VkDeviceFaultInfoEXT.npAddressInfos(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceFaultVendorInfoEXT} to the {@link VkDeviceFaultInfoEXT#pVendorInfos} field. */
        public VkDeviceFaultInfoEXT.Buffer pVendorInfos(@Nullable @NativeType("VkDeviceFaultVendorInfoEXT *") VkDeviceFaultVendorInfoEXT value) { VkDeviceFaultInfoEXT.npVendorInfos(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceFaultInfoEXT#pVendorBinaryData} field. */
        public VkDeviceFaultInfoEXT.Buffer pVendorBinaryData(@NativeType("void *") long value) { VkDeviceFaultInfoEXT.npVendorBinaryData(address(), value); return this; }

    }

}
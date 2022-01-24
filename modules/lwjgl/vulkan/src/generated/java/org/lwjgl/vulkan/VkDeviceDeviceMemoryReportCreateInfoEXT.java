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

/**
 * Register device memory report callbacks for a Vulkan device.
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback <b>may</b> be called from multiple threads simultaneously.</p>
 * 
 * <p>The callback <b>must</b> be called only once by the implementation when a {@code VkDeviceMemoryReportEventTypeEXT} event occurs.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The callback could be called from a background thread other than the thread calling the Vulkan commands.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pfnUserCallback} <b>must</b> be a valid {@link VkDeviceMemoryReportCallbackEXT} value</li>
 * <li>{@code pUserData} <b>must</b> be a pointer value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceMemoryReportCallbackEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceDeviceMemoryReportCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceMemoryReportFlagsEXT {@link #flags};
 *     {@link VkDeviceMemoryReportCallbackEXTI PFN_vkDeviceMemoryReportCallbackEXT} {@link #pfnUserCallback};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VkDeviceDeviceMemoryReportCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PFNUSERCALLBACK,
        PUSERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PFNUSERCALLBACK = layout.offsetof(3);
        PUSERDATA = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceDeviceMemoryReportCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** 0 and reserved for future use. */
    @NativeType("VkDeviceMemoryReportFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the application callback function to call. */
    @NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
    public VkDeviceMemoryReportCallbackEXT pfnUserCallback() { return npfnUserCallback(address()); }
    /** user data to be passed to the callback. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(@NativeType("VkDeviceMemoryReportFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnUserCallback} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(@NativeType("PFN_vkDeviceMemoryReportCallbackEXT") VkDeviceMemoryReportCallbackEXTI value) { npfnUserCallback(address(), value); return this; }
    /** Sets the specified value to the {@link #pUserData} field. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceDeviceMemoryReportCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        VkDeviceMemoryReportCallbackEXTI pfnUserCallback,
        long pUserData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnUserCallback(pfnUserCallback);
        pUserData(pUserData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceDeviceMemoryReportCreateInfoEXT set(VkDeviceDeviceMemoryReportCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT malloc() {
        return wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT calloc() {
        return wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance for the specified memory address. */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT create(long address) {
        return wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceDeviceMemoryReportCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDeviceDeviceMemoryReportCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceDeviceMemoryReportCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDeviceDeviceMemoryReportCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #pfnUserCallback}. */
    public static VkDeviceMemoryReportCallbackEXT npfnUserCallback(long struct) { return VkDeviceMemoryReportCallbackEXT.create(memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PFNUSERCALLBACK)); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PUSERDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceDeviceMemoryReportCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceDeviceMemoryReportCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #pfnUserCallback(VkDeviceMemoryReportCallbackEXTI) pfnUserCallback}. */
    public static void npfnUserCallback(long struct, VkDeviceMemoryReportCallbackEXTI value) { memPutAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PFNUSERCALLBACK, value.address()); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PUSERDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PFNUSERCALLBACK));
        check(memGetAddress(struct + VkDeviceDeviceMemoryReportCreateInfoEXT.PUSERDATA));
    }

    // -----------------------------------

    /** An array of {@link VkDeviceDeviceMemoryReportCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceDeviceMemoryReportCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDeviceDeviceMemoryReportCreateInfoEXT ELEMENT_FACTORY = VkDeviceDeviceMemoryReportCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceDeviceMemoryReportCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceDeviceMemoryReportCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceDeviceMemoryReportCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDeviceDeviceMemoryReportCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#flags} field. */
        @NativeType("VkDeviceMemoryReportFlagsEXT")
        public int flags() { return VkDeviceDeviceMemoryReportCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#pfnUserCallback} field. */
        @NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
        public VkDeviceMemoryReportCallbackEXT pfnUserCallback() { return VkDeviceDeviceMemoryReportCreateInfoEXT.npfnUserCallback(address()); }
        /** @return the value of the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkDeviceDeviceMemoryReportCreateInfoEXT.npUserData(address()); }

        /** Sets the specified value to the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#sType} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT} value to the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#sType} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#pNext} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDeviceDeviceMemoryReportCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#flags} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer flags(@NativeType("VkDeviceMemoryReportFlagsEXT") int value) { VkDeviceDeviceMemoryReportCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#pfnUserCallback} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer pfnUserCallback(@NativeType("PFN_vkDeviceMemoryReportCallbackEXT") VkDeviceMemoryReportCallbackEXTI value) { VkDeviceDeviceMemoryReportCreateInfoEXT.npfnUserCallback(address(), value); return this; }
        /** Sets the specified value to the {@link VkDeviceDeviceMemoryReportCreateInfoEXT#pUserData} field. */
        public VkDeviceDeviceMemoryReportCreateInfoEXT.Buffer pUserData(@NativeType("void *") long value) { VkDeviceDeviceMemoryReportCreateInfoEXT.npUserData(address(), value); return this; }

    }

}
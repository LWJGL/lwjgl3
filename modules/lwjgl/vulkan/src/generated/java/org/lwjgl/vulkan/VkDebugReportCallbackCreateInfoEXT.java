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
 * Structure specifying parameters of a newly created debug report callback.
 * 
 * <h5>Description</h5>
 * 
 * <p>For each {@code VkDebugReportCallbackEXT} that is created the {@link VkDebugReportCallbackCreateInfoEXT}{@code ::flags} determine when that {@link VkDebugReportCallbackCreateInfoEXT}{@code ::pfnCallback} is called. When an event happens, the implementation will do a bitwise AND of the event’s {@code VkDebugReportFlagBitsEXT} flags to each {@code VkDebugReportCallbackEXT} object’s flags. For each non-zero result the corresponding callback will be called. The callback will come directly from the component that detected the event, unless some other layer intercepts the calls for its own purposes (filter them in a different way, log to a system error log, etc.).</p>
 * 
 * <p>An application <b>may</b> receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as the originating Vulkan call.</p>
 * 
 * <p>A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple threads).</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugReport#VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
 * <li>{@code pfnCallback} <b>must</b> be a valid {@link VkDebugReportCallbackEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugReportCallbackEXT}, {@link EXTDebugReport#vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDebugReportCallbackCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDebugReportFlagsEXT {@link #flags};
 *     {@link VkDebugReportCallbackEXTI PFN_vkDebugReportCallbackEXT} {@link #pfnCallback};
 *     void * {@link #pUserData};
 * }</code></pre>
 */
public class VkDebugReportCallbackCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PFNCALLBACK,
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
        PFNCALLBACK = layout.offsetof(3);
        PUSERDATA = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkDebugReportCallbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDebugReportCallbackCreateInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkDebugReportFlagBitsEXT} specifying which event(s) will cause this callback to be called. */
    @NativeType("VkDebugReportFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the application callback function to call. */
    @NativeType("PFN_vkDebugReportCallbackEXT")
    public VkDebugReportCallbackEXT pfnCallback() { return npfnCallback(address()); }
    /** user data to be passed to the callback. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDebugReportCallbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDebugReport#VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkDebugReportCallbackCreateInfoEXT sType$Default() { return sType(EXTDebugReport.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDebugReportCallbackCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkDebugReportCallbackCreateInfoEXT flags(@NativeType("VkDebugReportFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnCallback} field. */
    public VkDebugReportCallbackCreateInfoEXT pfnCallback(@NativeType("PFN_vkDebugReportCallbackEXT") VkDebugReportCallbackEXTI value) { npfnCallback(address(), value); return this; }
    /** Sets the specified value to the {@link #pUserData} field. */
    public VkDebugReportCallbackCreateInfoEXT pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDebugReportCallbackCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        VkDebugReportCallbackEXTI pfnCallback,
        long pUserData
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnCallback(pfnCallback);
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
    public VkDebugReportCallbackCreateInfoEXT set(VkDebugReportCallbackCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDebugReportCallbackCreateInfoEXT malloc() {
        return wrap(VkDebugReportCallbackCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDebugReportCallbackCreateInfoEXT calloc() {
        return wrap(VkDebugReportCallbackCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDebugReportCallbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDebugReportCallbackCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDebugReportCallbackCreateInfoEXT} instance for the specified memory address. */
    public static VkDebugReportCallbackCreateInfoEXT create(long address) {
        return wrap(VkDebugReportCallbackCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugReportCallbackCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDebugReportCallbackCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugReportCallbackCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugReportCallbackCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDebugReportCallbackCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDebugReportCallbackCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDebugReportCallbackCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDebugReportCallbackCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDebugReportCallbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugReportCallbackCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDebugReportCallbackCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDebugReportCallbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDebugReportCallbackCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDebugReportCallbackCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugReportCallbackCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDebugReportCallbackCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDebugReportCallbackCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDebugReportCallbackCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #pfnCallback}. */
    public static VkDebugReportCallbackEXT npfnCallback(long struct) { return VkDebugReportCallbackEXT.create(memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK)); }
    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PUSERDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugReportCallbackCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkDebugReportCallbackCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #pfnCallback(VkDebugReportCallbackEXTI) pfnCallback}. */
    public static void npfnCallback(long struct, VkDebugReportCallbackEXTI value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK, value.address()); }
    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PUSERDATA, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK));
    }

    // -----------------------------------

    /** An array of {@link VkDebugReportCallbackCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDebugReportCallbackCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDebugReportCallbackCreateInfoEXT ELEMENT_FACTORY = VkDebugReportCallbackCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDebugReportCallbackCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDebugReportCallbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDebugReportCallbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDebugReportCallbackCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDebugReportCallbackCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDebugReportCallbackCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDebugReportCallbackCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDebugReportCallbackCreateInfoEXT#flags} field. */
        @NativeType("VkDebugReportFlagsEXT")
        public int flags() { return VkDebugReportCallbackCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkDebugReportCallbackCreateInfoEXT#pfnCallback} field. */
        @NativeType("PFN_vkDebugReportCallbackEXT")
        public VkDebugReportCallbackEXT pfnCallback() { return VkDebugReportCallbackCreateInfoEXT.npfnCallback(address()); }
        /** @return the value of the {@link VkDebugReportCallbackCreateInfoEXT#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkDebugReportCallbackCreateInfoEXT.npUserData(address()); }

        /** Sets the specified value to the {@link VkDebugReportCallbackCreateInfoEXT#sType} field. */
        public VkDebugReportCallbackCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDebugReportCallbackCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDebugReport#VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT} value to the {@link VkDebugReportCallbackCreateInfoEXT#sType} field. */
        public VkDebugReportCallbackCreateInfoEXT.Buffer sType$Default() { return sType(EXTDebugReport.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkDebugReportCallbackCreateInfoEXT#pNext} field. */
        public VkDebugReportCallbackCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDebugReportCallbackCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugReportCallbackCreateInfoEXT#flags} field. */
        public VkDebugReportCallbackCreateInfoEXT.Buffer flags(@NativeType("VkDebugReportFlagsEXT") int value) { VkDebugReportCallbackCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugReportCallbackCreateInfoEXT#pfnCallback} field. */
        public VkDebugReportCallbackCreateInfoEXT.Buffer pfnCallback(@NativeType("PFN_vkDebugReportCallbackEXT") VkDebugReportCallbackEXTI value) { VkDebugReportCallbackCreateInfoEXT.npfnCallback(address(), value); return this; }
        /** Sets the specified value to the {@link VkDebugReportCallbackCreateInfoEXT#pUserData} field. */
        public VkDebugReportCallbackCreateInfoEXT.Buffer pUserData(@NativeType("void *") long value) { VkDebugReportCallbackCreateInfoEXT.npUserData(address(), value); return this; }

    }

}
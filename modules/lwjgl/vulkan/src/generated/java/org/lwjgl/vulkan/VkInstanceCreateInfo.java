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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkInstanceCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkInstanceCreateFlags flags;
 *     {@link VkApplicationInfo VkApplicationInfo} const * pApplicationInfo;
 *     uint32_t enabledLayerCount;
 *     char const * const * ppEnabledLayerNames;
 *     uint32_t enabledExtensionCount;
 *     char const * const * ppEnabledExtensionNames;
 * }</code></pre>
 */
public class VkInstanceCreateInfo extends Struct<VkInstanceCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PAPPLICATIONINFO,
        ENABLEDLAYERCOUNT,
        PPENABLEDLAYERNAMES,
        ENABLEDEXTENSIONCOUNT,
        PPENABLEDEXTENSIONNAMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PAPPLICATIONINFO = layout.offsetof(3);
        ENABLEDLAYERCOUNT = layout.offsetof(4);
        PPENABLEDLAYERNAMES = layout.offsetof(5);
        ENABLEDEXTENSIONCOUNT = layout.offsetof(6);
        PPENABLEDEXTENSIONNAMES = layout.offsetof(7);
    }

    protected VkInstanceCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkInstanceCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkInstanceCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkInstanceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkInstanceCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkInstanceCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkApplicationInfo} view of the struct pointed to by the {@code pApplicationInfo} field. */
    @NativeType("VkApplicationInfo const *")
    public @Nullable VkApplicationInfo pApplicationInfo() { return npApplicationInfo(address()); }
    /** @return the value of the {@code enabledLayerCount} field. */
    @NativeType("uint32_t")
    public int enabledLayerCount() { return nenabledLayerCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
    /** @return the value of the {@code enabledExtensionCount} field. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkInstanceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO} value to the {@code sType} field. */
    public VkInstanceCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkInstanceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDebugReportCallbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkDebugReportCallbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDebugUtilsMessengerCreateInfoEXT} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkDebugUtilsMessengerCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkDirectDriverLoadingListLUNARG} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkDirectDriverLoadingListLUNARG value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkLayerSettingsCreateInfoEXT} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkLayerSettingsCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkValidationFeaturesEXT} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkValidationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkValidationFlagsEXT} value to the {@code pNext} chain. */
    public VkInstanceCreateInfo pNext(VkValidationFlagsEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkInstanceCreateInfo flags(@NativeType("VkInstanceCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkApplicationInfo} to the {@code pApplicationInfo} field. */
    public VkInstanceCreateInfo pApplicationInfo(@Nullable @NativeType("VkApplicationInfo const *") VkApplicationInfo value) { npApplicationInfo(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
    public VkInstanceCreateInfo ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
    public VkInstanceCreateInfo ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledExtensionNames(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkInstanceCreateInfo set(
        int sType,
        long pNext,
        int flags,
        @Nullable VkApplicationInfo pApplicationInfo,
        @Nullable PointerBuffer ppEnabledLayerNames,
        @Nullable PointerBuffer ppEnabledExtensionNames
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pApplicationInfo(pApplicationInfo);
        ppEnabledLayerNames(ppEnabledLayerNames);
        ppEnabledExtensionNames(ppEnabledExtensionNames);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkInstanceCreateInfo set(VkInstanceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkInstanceCreateInfo malloc() {
        return new VkInstanceCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkInstanceCreateInfo calloc() {
        return new VkInstanceCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkInstanceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkInstanceCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance for the specified memory address. */
    public static VkInstanceCreateInfo create(long address) {
        return new VkInstanceCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkInstanceCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkInstanceCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkInstanceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkInstanceCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkInstanceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkInstanceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInstanceCreateInfo malloc(MemoryStack stack) {
        return new VkInstanceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkInstanceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInstanceCreateInfo calloc(MemoryStack stack) {
        return new VkInstanceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkInstanceCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkInstanceCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkInstanceCreateInfo.FLAGS); }
    /** Unsafe version of {@link #pApplicationInfo}. */
    public static @Nullable VkApplicationInfo npApplicationInfo(long struct) { return VkApplicationInfo.createSafe(memGetAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO)); }
    /** Unsafe version of {@link #enabledLayerCount}. */
    public static int nenabledLayerCount(long struct) { return memGetInt(struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT); }
    /** Unsafe version of {@link #ppEnabledLayerNames() ppEnabledLayerNames}. */
    public static @Nullable PointerBuffer nppEnabledLayerNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES), nenabledLayerCount(struct)); }
    /** Unsafe version of {@link #enabledExtensionCount}. */
    public static int nenabledExtensionCount(long struct) { return memGetInt(struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT); }
    /** Unsafe version of {@link #ppEnabledExtensionNames() ppEnabledExtensionNames}. */
    public static @Nullable PointerBuffer nppEnabledExtensionNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkInstanceCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #pApplicationInfo(VkApplicationInfo) pApplicationInfo}. */
    public static void npApplicationInfo(long struct, @Nullable VkApplicationInfo value) { memPutAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO, memAddressSafe(value)); }
    /** Sets the specified value to the {@code enabledLayerCount} field of the specified {@code struct}. */
    public static void nenabledLayerCount(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT, value); }
    /** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
    public static void nppEnabledLayerNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); nenabledLayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
    public static void nenabledExtensionCount(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
    /** Unsafe version of {@link #ppEnabledExtensionNames(PointerBuffer) ppEnabledExtensionNames}. */
    public static void nppEnabledExtensionNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES, memAddressSafe(value)); nenabledExtensionCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nenabledLayerCount(struct) != 0) {
            check(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES));
        }
        if (nenabledExtensionCount(struct) != 0) {
            check(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkInstanceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkInstanceCreateInfo, Buffer> implements NativeResource {

        private static final VkInstanceCreateInfo ELEMENT_FACTORY = VkInstanceCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkInstanceCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkInstanceCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkInstanceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkInstanceCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkInstanceCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkInstanceCreateFlags")
        public int flags() { return VkInstanceCreateInfo.nflags(address()); }
        /** @return a {@link VkApplicationInfo} view of the struct pointed to by the {@code pApplicationInfo} field. */
        @NativeType("VkApplicationInfo const *")
        public @Nullable VkApplicationInfo pApplicationInfo() { return VkInstanceCreateInfo.npApplicationInfo(address()); }
        /** @return the value of the {@code enabledLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledLayerCount() { return VkInstanceCreateInfo.nenabledLayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer ppEnabledLayerNames() { return VkInstanceCreateInfo.nppEnabledLayerNames(address()); }
        /** @return the value of the {@code enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return VkInstanceCreateInfo.nenabledExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer ppEnabledExtensionNames() { return VkInstanceCreateInfo.nppEnabledExtensionNames(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkInstanceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkInstanceCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO} value to the {@code sType} field. */
        public VkInstanceCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkInstanceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkInstanceCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDebugReportCallbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkDebugReportCallbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDebugUtilsMessengerCreateInfoEXT} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkDebugUtilsMessengerCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkDirectDriverLoadingListLUNARG} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkDirectDriverLoadingListLUNARG value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkExportMetalObjectCreateInfoEXT} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkExportMetalObjectCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkLayerSettingsCreateInfoEXT} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkLayerSettingsCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkValidationFeaturesEXT} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkValidationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkValidationFlagsEXT} value to the {@code pNext} chain. */
        public VkInstanceCreateInfo.Buffer pNext(VkValidationFlagsEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkInstanceCreateInfo.Buffer flags(@NativeType("VkInstanceCreateFlags") int value) { VkInstanceCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkApplicationInfo} to the {@code pApplicationInfo} field. */
        public VkInstanceCreateInfo.Buffer pApplicationInfo(@Nullable @NativeType("VkApplicationInfo const *") VkApplicationInfo value) { VkInstanceCreateInfo.npApplicationInfo(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
        public VkInstanceCreateInfo.Buffer ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkInstanceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
        public VkInstanceCreateInfo.Buffer ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkInstanceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }

    }

}
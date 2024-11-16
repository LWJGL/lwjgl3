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
 * Structure specifying parameters of a newly created instance.
 * 
 * <h5>Description</h5>
 * 
 * <p>To capture events that occur while creating or destroying an instance, an application <b>can</b> link a {@link VkDebugReportCallbackCreateInfoEXT} structure or a {@link VkDebugUtilsMessengerCreateInfoEXT} structure to the {@code pNext} element of the {@link VkInstanceCreateInfo} structure given to {@code vkCreateInstance}. This callback is only valid for the duration of the {@link VK10#vkCreateInstance CreateInstance} and the {@link VK10#vkDestroyInstance DestroyInstance} call. Use {@link EXTDebugReport#vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT} or {@link EXTDebugUtils#vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT} to create persistent callback objects.</p>
 * 
 * <p>An application can add additional drivers by including the {@link VkDirectDriverLoadingListLUNARG} struct to the {@code pNext} element of the {@link VkInstanceCreateInfo} structure given to {@code vkCreateInstance}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>{@link VkDirectDriverLoadingListLUNARG} allows applications to ship drivers with themselves. Only drivers that are designed to work with it should be used, such as drivers that implement Vulkan in software or that implement Vulkan by translating it to a different API. Any driver that requires installation should not be used, such as hardware drivers.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain of {@link VkInstanceCreateInfo} includes a {@link VkDebugReportCallbackCreateInfoEXT} structure, the list of enabled extensions in {@code ppEnabledExtensionNames} <b>must</b> contain {@link EXTDebugReport VK_EXT_debug_report}</li>
 * <li>If the {@code pNext} chain of {@link VkInstanceCreateInfo} includes a {@link VkDebugUtilsMessengerCreateInfoEXT} structure, the list of enabled extensions in {@code ppEnabledExtensionNames} <b>must</b> contain {@link EXTDebugUtils VK_EXT_debug_utils}</li>
 * <li>If the {@code pNext} chain includes a {@link VkExportMetalObjectCreateInfoEXT} structure, its {@code exportObjectType} member <b>must</b> be either {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT} or {@link EXTMetalObjects#VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT}</li>
 * <li>If {@code flags} has the {@link KHRPortabilityEnumeration#VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR} bit set, the list of enabled extensions in {@code ppEnabledExtensionNames} <b>must</b> contain {@link KHRPortabilityEnumeration VK_KHR_portability_enumeration}</li>
 * <li>If the {@code pNext} chain of {@link VkInstanceCreateInfo} includes a {@link VkDirectDriverLoadingListLUNARG} structure, the list of enabled extensions in {@code ppEnabledExtensionNames} <b>must</b> contain {@link LUNARGDirectDriverLoading VK_LUNARG_direct_driver_loading}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDebugReportCallbackCreateInfoEXT}, {@link VkDebugUtilsMessengerCreateInfoEXT}, {@link VkDirectDriverLoadingListLUNARG}, {@link VkExportMetalObjectCreateInfoEXT}, {@link VkLayerSettingsCreateInfoEXT}, {@link VkValidationFeaturesEXT}, or {@link VkValidationFlagsEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique, with the exception of structures of type {@link VkDebugUtilsMessengerCreateInfoEXT}, {@link VkExportMetalObjectCreateInfoEXT}, or {@link VkLayerSettingsCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkInstanceCreateFlagBits} values</li>
 * <li>If {@code pApplicationInfo} is not {@code NULL}, {@code pApplicationInfo} <b>must</b> be a valid pointer to a valid {@link VkApplicationInfo} structure</li>
 * <li>If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} <b>must</b> be a valid pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings</li>
 * <li>If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} <b>must</b> be a valid pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkApplicationInfo}, {@link VK10#vkCreateInstance CreateInstance}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkInstanceCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkInstanceCreateFlags {@link #flags};
 *     {@link VkApplicationInfo VkApplicationInfo} const * {@link #pApplicationInfo};
 *     uint32_t {@link #enabledLayerCount};
 *     char const * const * {@link #ppEnabledLayerNames};
 *     uint32_t {@link #enabledExtensionCount};
 *     char const * const * {@link #ppEnabledExtensionNames};
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkInstanceCreateFlagBits} indicating the behavior of the instance. */
    @NativeType("VkInstanceCreateFlags")
    public int flags() { return nflags(address()); }
    /** {@code NULL} or a pointer to a {@link VkApplicationInfo} structure. If not {@code NULL}, this information helps implementations recognize behavior inherent to classes of applications. {@link VkApplicationInfo} is defined in detail below. */
    @NativeType("VkApplicationInfo const *")
    public @Nullable VkApplicationInfo pApplicationInfo() { return npApplicationInfo(address()); }
    /** the number of global layers to enable. */
    @NativeType("uint32_t")
    public int enabledLayerCount() { return nenabledLayerCount(address()); }
    /** a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable for the created instance. The layers are loaded in the order they are listed in this array, with the first array element being the closest to the application, and the last array element being the closest to the driver. See the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-layers">Layers</a> section for further details. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
    /** the number of global extensions to enable. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkInstanceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO} value to the {@link #sType} field. */
    public VkInstanceCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
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
    /** Sets the specified value to the {@link #flags} field. */
    public VkInstanceCreateInfo flags(@NativeType("VkInstanceCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkApplicationInfo} to the {@link #pApplicationInfo} field. */
    public VkInstanceCreateInfo pApplicationInfo(@Nullable @NativeType("VkApplicationInfo const *") VkApplicationInfo value) { npApplicationInfo(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppEnabledLayerNames} field. */
    public VkInstanceCreateInfo ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #ppEnabledExtensionNames} field. */
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

        /** @return the value of the {@link VkInstanceCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkInstanceCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkInstanceCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkInstanceCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkInstanceCreateInfo#flags} field. */
        @NativeType("VkInstanceCreateFlags")
        public int flags() { return VkInstanceCreateInfo.nflags(address()); }
        /** @return a {@link VkApplicationInfo} view of the struct pointed to by the {@link VkInstanceCreateInfo#pApplicationInfo} field. */
        @NativeType("VkApplicationInfo const *")
        public @Nullable VkApplicationInfo pApplicationInfo() { return VkInstanceCreateInfo.npApplicationInfo(address()); }
        /** @return the value of the {@link VkInstanceCreateInfo#enabledLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledLayerCount() { return VkInstanceCreateInfo.nenabledLayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkInstanceCreateInfo#ppEnabledLayerNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer ppEnabledLayerNames() { return VkInstanceCreateInfo.nppEnabledLayerNames(address()); }
        /** @return the value of the {@link VkInstanceCreateInfo#enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return VkInstanceCreateInfo.nenabledExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link VkInstanceCreateInfo#ppEnabledExtensionNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer ppEnabledExtensionNames() { return VkInstanceCreateInfo.nppEnabledExtensionNames(address()); }

        /** Sets the specified value to the {@link VkInstanceCreateInfo#sType} field. */
        public VkInstanceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkInstanceCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO} value to the {@link VkInstanceCreateInfo#sType} field. */
        public VkInstanceCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkInstanceCreateInfo#pNext} field. */
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
        /** Sets the specified value to the {@link VkInstanceCreateInfo#flags} field. */
        public VkInstanceCreateInfo.Buffer flags(@NativeType("VkInstanceCreateFlags") int value) { VkInstanceCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkApplicationInfo} to the {@link VkInstanceCreateInfo#pApplicationInfo} field. */
        public VkInstanceCreateInfo.Buffer pApplicationInfo(@Nullable @NativeType("VkApplicationInfo const *") VkApplicationInfo value) { VkInstanceCreateInfo.npApplicationInfo(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkInstanceCreateInfo#ppEnabledLayerNames} field. */
        public VkInstanceCreateInfo.Buffer ppEnabledLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkInstanceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link VkInstanceCreateInfo#ppEnabledExtensionNames} field. */
        public VkInstanceCreateInfo.Buffer ppEnabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { VkInstanceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }

    }

}
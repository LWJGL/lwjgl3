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
 * Structure specifying parameters of a newly created instance.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDebugReportCallbackCreateInfoEXT}, {@link VkDebugUtilsMessengerCreateInfoEXT}, {@link VkValidationFeaturesEXT}, or {@link VkValidationFlagsEXT}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code pApplicationInfo} is not {@code NULL}, {@code pApplicationInfo} <b>must</b> be a valid pointer to a valid {@link VkApplicationInfo} structure</li>
 * <li>If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} <b>must</b> be a valid pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings</li>
 * <li>If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} <b>must</b> be a valid pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkApplicationInfo}, {@link VK10#vkCreateInstance CreateInstance}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code pApplicationInfo} &ndash; {@code NULL} or a pointer to a {@link VkApplicationInfo} structure. If not {@code NULL}, this information helps implementations recognize behavior inherent to classes of applications. {@link VkApplicationInfo} is defined in detail below.</li>
 * <li>{@code enabledLayerCount} &ndash; the number of global layers to enable.</li>
 * <li>{@code ppEnabledLayerNames} &ndash; a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable for the created instance. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-layers">Layers</a> section for further details.</li>
 * <li>{@code enabledExtensionCount} &ndash; the number of global extensions to enable.</li>
 * <li>{@code ppEnabledExtensionNames} &ndash; a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
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
public class VkInstanceCreateInfo extends Struct implements NativeResource {

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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkInstanceCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns a {@link VkApplicationInfo} view of the struct pointed to by the {@code pApplicationInfo} field. */
    @Nullable
    @NativeType("VkApplicationInfo const *")
    public VkApplicationInfo pApplicationInfo() { return npApplicationInfo(address()); }
    /** Returns the value of the {@code enabledLayerCount} field. */
    @NativeType("uint32_t")
    public int enabledLayerCount() { return nenabledLayerCount(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
    /** Returns the value of the {@code enabledExtensionCount} field. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkInstanceCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkInstanceCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
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
        return wrap(VkInstanceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkInstanceCreateInfo calloc() {
        return wrap(VkInstanceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkInstanceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkInstanceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance for the specified memory address. */
    public static VkInstanceCreateInfo create(long address) {
        return wrap(VkInstanceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInstanceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkInstanceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkInstanceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkInstanceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkInstanceCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkInstanceCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkInstanceCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkInstanceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInstanceCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkInstanceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkInstanceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkInstanceCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkInstanceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkInstanceCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkInstanceCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkInstanceCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkInstanceCreateInfo.FLAGS); }
    /** Unsafe version of {@link #pApplicationInfo}. */
    @Nullable public static VkApplicationInfo npApplicationInfo(long struct) { return VkApplicationInfo.createSafe(memGetAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO)); }
    /** Unsafe version of {@link #enabledLayerCount}. */
    public static int nenabledLayerCount(long struct) { return UNSAFE.getInt(null, struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT); }
    /** Unsafe version of {@link #ppEnabledLayerNames() ppEnabledLayerNames}. */
    @Nullable public static PointerBuffer nppEnabledLayerNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES), nenabledLayerCount(struct)); }
    /** Unsafe version of {@link #enabledExtensionCount}. */
    public static int nenabledExtensionCount(long struct) { return UNSAFE.getInt(null, struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT); }
    /** Unsafe version of {@link #ppEnabledExtensionNames() ppEnabledExtensionNames}. */
    @Nullable public static PointerBuffer nppEnabledExtensionNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkInstanceCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkInstanceCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkInstanceCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #pApplicationInfo(VkApplicationInfo) pApplicationInfo}. */
    public static void npApplicationInfo(long struct, @Nullable VkApplicationInfo value) { memPutAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO, memAddressSafe(value)); }
    /** Sets the specified value to the {@code enabledLayerCount} field of the specified {@code struct}. */
    public static void nenabledLayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT, value); }
    /** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
    public static void nppEnabledLayerNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); nenabledLayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
    public static void nenabledExtensionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkInstanceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkInstanceCreateInfo, Buffer> implements NativeResource {

        private static final VkInstanceCreateInfo ELEMENT_FACTORY = VkInstanceCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkInstanceCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkInstanceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkInstanceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkInstanceCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkInstanceCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkInstanceCreateFlags")
        public int flags() { return VkInstanceCreateInfo.nflags(address()); }
        /** Returns a {@link VkApplicationInfo} view of the struct pointed to by the {@code pApplicationInfo} field. */
        @Nullable
        @NativeType("VkApplicationInfo const *")
        public VkApplicationInfo pApplicationInfo() { return VkInstanceCreateInfo.npApplicationInfo(address()); }
        /** Returns the value of the {@code enabledLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledLayerCount() { return VkInstanceCreateInfo.nenabledLayerCount(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer ppEnabledLayerNames() { return VkInstanceCreateInfo.nppEnabledLayerNames(address()); }
        /** Returns the value of the {@code enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return VkInstanceCreateInfo.nenabledExtensionCount(address()); }
        /** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer ppEnabledExtensionNames() { return VkInstanceCreateInfo.nppEnabledExtensionNames(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkInstanceCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkInstanceCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkInstanceCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkInstanceCreateInfo.npNext(address(), value); return this; }
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
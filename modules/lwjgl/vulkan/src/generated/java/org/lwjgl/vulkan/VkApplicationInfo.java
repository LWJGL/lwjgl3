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
 * Structure specifying application information.
 * 
 * <h5>Description</h5>
 * 
 * <p>Vulkan 1.0 implementations were required to return {@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER} if {@code apiVersion} was larger than 1.0. Implementations that support Vulkan 1.1 or later <b>must</b> not return {@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER} for any value of {@code apiVersion}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Because Vulkan 1.0 implementations <b>may</b> fail with {@link VK10#VK_ERROR_INCOMPATIBLE_DRIVER ERROR_INCOMPATIBLE_DRIVER}, applications <b>should</b> determine the version of Vulkan available before calling {@link VK10#vkCreateInstance CreateInstance}. If the {@link VK10#vkGetInstanceProcAddr GetInstanceProcAddr} returns {@code NULL} for {@link VK11#vkEnumerateInstanceVersion EnumerateInstanceVersion}, it is a Vulkan 1.0 implementation. Otherwise, the application <b>can</b> call {@link VK11#vkEnumerateInstanceVersion EnumerateInstanceVersion} to determine the version of Vulkan.</p>
 * </div>
 * 
 * <p>As long as the instance supports at least Vulkan 1.1, an application <b>can</b> use different versions of Vulkan with an instance than it does with a device or physical device.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The Khronos validation layers will treat {@code apiVersion} as the highest API version the application targets, and will validate API usage against the minimum of that version and the implementation version (instance or device, depending on context). If an application tries to use functionality from a greater version than this, a validation error will be triggered.</p>
 * 
 * <p>For example, if the instance supports Vulkan 1.1 and three physical devices support Vulkan 1.0, Vulkan 1.1, and Vulkan 1.2, respectively, and if the application sets {@code apiVersion} to 1.2, the application <b>can</b> use the following versions of Vulkan:</p>
 * 
 * <ul>
 * <li>Vulkan 1.0 <b>can</b> be used with the instance and with all physical devices.</li>
 * <li>Vulkan 1.1 <b>can</b> be used with the instance and with the physical devices that support Vulkan 1.1 and Vulkan 1.2.</li>
 * <li>Vulkan 1.2 <b>can</b> be used with the physical device that supports Vulkan 1.2.</li>
 * </ul>
 * 
 * <p>If we modify the above example so that the application sets {@code apiVersion} to 1.1, then the application <b>must</b> not use Vulkan 1.2 functionality on the physical device that supports Vulkan 1.2.</p>
 * </div>
 * 
 * <p>Implicit layers <b>must</b> be disabled if they do not support a version at least as high as {@code apiVersion}. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#LoaderInterfaceArchitecture">“{@code Architecture of the Vulkan Loader Interfaces}”</a> document for additional information.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Providing a {@code NULL} {@link VkInstanceCreateInfo}{@code ::pApplicationInfo} or providing an {@code apiVersion} of 0 is equivalent to providing an {@code apiVersion} of {@code VK_MAKE_API_VERSION(0,1,0,0)}.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code apiVersion} is not 0, then it <b>must</b> be greater than or equal to {@link VK10#VK_API_VERSION_1_0 API_VERSION_1_0}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code pApplicationName} is not {@code NULL}, {@code pApplicationName} <b>must</b> be a null-terminated UTF-8 string</li>
 * <li>If {@code pEngineName} is not {@code NULL}, {@code pEngineName} <b>must</b> be a null-terminated UTF-8 string</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkInstanceCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkApplicationInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     char const * {@link #pApplicationName};
 *     uint32_t {@link #applicationVersion};
 *     char const * {@link #pEngineName};
 *     uint32_t {@link #engineVersion};
 *     uint32_t {@link #apiVersion};
 * }</code></pre>
 */
public class VkApplicationInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PAPPLICATIONNAME,
        APPLICATIONVERSION,
        PENGINENAME,
        ENGINEVERSION,
        APIVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PAPPLICATIONNAME = layout.offsetof(2);
        APPLICATIONVERSION = layout.offsetof(3);
        PENGINENAME = layout.offsetof(4);
        ENGINEVERSION = layout.offsetof(5);
        APIVERSION = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkApplicationInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkApplicationInfo(ByteBuffer container) {
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
    /** {@code NULL} or is a pointer to a null-terminated UTF-8 string containing the name of the application. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pApplicationName() { return npApplicationName(address()); }
    /** {@code NULL} or is a pointer to a null-terminated UTF-8 string containing the name of the application. */
    @Nullable
    @NativeType("char const *")
    public String pApplicationNameString() { return npApplicationNameString(address()); }
    /** an unsigned integer variable containing the developer-supplied version number of the application. */
    @NativeType("uint32_t")
    public int applicationVersion() { return napplicationVersion(address()); }
    /** {@code NULL} or is a pointer to a null-terminated UTF-8 string containing the name of the engine (if any) used to create the application. */
    @Nullable
    @NativeType("char const *")
    public ByteBuffer pEngineName() { return npEngineName(address()); }
    /** {@code NULL} or is a pointer to a null-terminated UTF-8 string containing the name of the engine (if any) used to create the application. */
    @Nullable
    @NativeType("char const *")
    public String pEngineNameString() { return npEngineNameString(address()); }
    /** an unsigned integer variable containing the developer-supplied version number of the engine used to create the application. */
    @NativeType("uint32_t")
    public int engineVersion() { return nengineVersion(address()); }
    /** <b>must</b> be the highest version of Vulkan that the application is designed to use, encoded as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-coreversions-versionnumbers">Version Numbers</a>. The patch version number specified in {@code apiVersion} is ignored when creating an instance object. Only the major and minor versions of the instance <b>must</b> match those requested in {@code apiVersion}. */
    @NativeType("uint32_t")
    public int apiVersion() { return napiVersion(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkApplicationInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO} value to the {@link #sType} field. */
    public VkApplicationInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkApplicationInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pApplicationName} field. */
    public VkApplicationInfo pApplicationName(@Nullable @NativeType("char const *") ByteBuffer value) { npApplicationName(address(), value); return this; }
    /** Sets the specified value to the {@link #applicationVersion} field. */
    public VkApplicationInfo applicationVersion(@NativeType("uint32_t") int value) { napplicationVersion(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #pEngineName} field. */
    public VkApplicationInfo pEngineName(@Nullable @NativeType("char const *") ByteBuffer value) { npEngineName(address(), value); return this; }
    /** Sets the specified value to the {@link #engineVersion} field. */
    public VkApplicationInfo engineVersion(@NativeType("uint32_t") int value) { nengineVersion(address(), value); return this; }
    /** Sets the specified value to the {@link #apiVersion} field. */
    public VkApplicationInfo apiVersion(@NativeType("uint32_t") int value) { napiVersion(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkApplicationInfo set(
        int sType,
        long pNext,
        @Nullable ByteBuffer pApplicationName,
        int applicationVersion,
        @Nullable ByteBuffer pEngineName,
        int engineVersion,
        int apiVersion
    ) {
        sType(sType);
        pNext(pNext);
        pApplicationName(pApplicationName);
        applicationVersion(applicationVersion);
        pEngineName(pEngineName);
        engineVersion(engineVersion);
        apiVersion(apiVersion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkApplicationInfo set(VkApplicationInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkApplicationInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkApplicationInfo malloc() {
        return wrap(VkApplicationInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkApplicationInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkApplicationInfo calloc() {
        return wrap(VkApplicationInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkApplicationInfo} instance allocated with {@link BufferUtils}. */
    public static VkApplicationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkApplicationInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkApplicationInfo} instance for the specified memory address. */
    public static VkApplicationInfo create(long address) {
        return wrap(VkApplicationInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkApplicationInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkApplicationInfo.class, address);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkApplicationInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkApplicationInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkApplicationInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkApplicationInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkApplicationInfo malloc(MemoryStack stack) {
        return wrap(VkApplicationInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkApplicationInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkApplicationInfo calloc(MemoryStack stack) {
        return wrap(VkApplicationInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkApplicationInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkApplicationInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkApplicationInfo.PNEXT); }
    /** Unsafe version of {@link #pApplicationName}. */
    @Nullable public static ByteBuffer npApplicationName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
    /** Unsafe version of {@link #pApplicationNameString}. */
    @Nullable public static String npApplicationNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkApplicationInfo.PAPPLICATIONNAME)); }
    /** Unsafe version of {@link #applicationVersion}. */
    public static int napplicationVersion(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.APPLICATIONVERSION); }
    /** Unsafe version of {@link #pEngineName}. */
    @Nullable public static ByteBuffer npEngineName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
    /** Unsafe version of {@link #pEngineNameString}. */
    @Nullable public static String npEngineNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkApplicationInfo.PENGINENAME)); }
    /** Unsafe version of {@link #engineVersion}. */
    public static int nengineVersion(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.ENGINEVERSION); }
    /** Unsafe version of {@link #apiVersion}. */
    public static int napiVersion(long struct) { return UNSAFE.getInt(null, struct + VkApplicationInfo.APIVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkApplicationInfo.PNEXT, value); }
    /** Unsafe version of {@link #pApplicationName(ByteBuffer) pApplicationName}. */
    public static void npApplicationName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkApplicationInfo.PAPPLICATIONNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #applicationVersion(int) applicationVersion}. */
    public static void napplicationVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.APPLICATIONVERSION, value); }
    /** Unsafe version of {@link #pEngineName(ByteBuffer) pEngineName}. */
    public static void npEngineName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkApplicationInfo.PENGINENAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #engineVersion(int) engineVersion}. */
    public static void nengineVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.ENGINEVERSION, value); }
    /** Unsafe version of {@link #apiVersion(int) apiVersion}. */
    public static void napiVersion(long struct, int value) { UNSAFE.putInt(null, struct + VkApplicationInfo.APIVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkApplicationInfo} structs. */
    public static class Buffer extends StructBuffer<VkApplicationInfo, Buffer> implements NativeResource {

        private static final VkApplicationInfo ELEMENT_FACTORY = VkApplicationInfo.create(-1L);

        /**
         * Creates a new {@code VkApplicationInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkApplicationInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkApplicationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkApplicationInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkApplicationInfo.nsType(address()); }
        /** @return the value of the {@link VkApplicationInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkApplicationInfo.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkApplicationInfo#pApplicationName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pApplicationName() { return VkApplicationInfo.npApplicationName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkApplicationInfo#pApplicationName} field. */
        @Nullable
        @NativeType("char const *")
        public String pApplicationNameString() { return VkApplicationInfo.npApplicationNameString(address()); }
        /** @return the value of the {@link VkApplicationInfo#applicationVersion} field. */
        @NativeType("uint32_t")
        public int applicationVersion() { return VkApplicationInfo.napplicationVersion(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link VkApplicationInfo#pEngineName} field. */
        @Nullable
        @NativeType("char const *")
        public ByteBuffer pEngineName() { return VkApplicationInfo.npEngineName(address()); }
        /** @return the null-terminated string pointed to by the {@link VkApplicationInfo#pEngineName} field. */
        @Nullable
        @NativeType("char const *")
        public String pEngineNameString() { return VkApplicationInfo.npEngineNameString(address()); }
        /** @return the value of the {@link VkApplicationInfo#engineVersion} field. */
        @NativeType("uint32_t")
        public int engineVersion() { return VkApplicationInfo.nengineVersion(address()); }
        /** @return the value of the {@link VkApplicationInfo#apiVersion} field. */
        @NativeType("uint32_t")
        public int apiVersion() { return VkApplicationInfo.napiVersion(address()); }

        /** Sets the specified value to the {@link VkApplicationInfo#sType} field. */
        public VkApplicationInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkApplicationInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_APPLICATION_INFO STRUCTURE_TYPE_APPLICATION_INFO} value to the {@link VkApplicationInfo#sType} field. */
        public VkApplicationInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO); }
        /** Sets the specified value to the {@link VkApplicationInfo#pNext} field. */
        public VkApplicationInfo.Buffer pNext(@NativeType("void const *") long value) { VkApplicationInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkApplicationInfo#pApplicationName} field. */
        public VkApplicationInfo.Buffer pApplicationName(@Nullable @NativeType("char const *") ByteBuffer value) { VkApplicationInfo.npApplicationName(address(), value); return this; }
        /** Sets the specified value to the {@link VkApplicationInfo#applicationVersion} field. */
        public VkApplicationInfo.Buffer applicationVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.napplicationVersion(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link VkApplicationInfo#pEngineName} field. */
        public VkApplicationInfo.Buffer pEngineName(@Nullable @NativeType("char const *") ByteBuffer value) { VkApplicationInfo.npEngineName(address(), value); return this; }
        /** Sets the specified value to the {@link VkApplicationInfo#engineVersion} field. */
        public VkApplicationInfo.Buffer engineVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.nengineVersion(address(), value); return this; }
        /** Sets the specified value to the {@link VkApplicationInfo#apiVersion} field. */
        public VkApplicationInfo.Buffer apiVersion(@NativeType("uint32_t") int value) { VkApplicationInfo.napiVersion(address(), value); return this; }

    }

}
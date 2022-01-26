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
 * Structure describing barycentric support in fragment shaders that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-barycentric">Barycentric Interpolation</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #fragmentShaderBarycentric};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSHADERBARYCENTRIC;

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
        FRAGMENTSHADERBARYCENTRIC = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports the {@code BaryCoordNV} and {@code BaryCoordNoPerspNV} SPIR-V fragment shader built-ins and supports the {@code PerVertexNV} SPIR-V decoration on fragment shader input variables. */
    @NativeType("VkBool32")
    public boolean fragmentShaderBarycentric() { return nfragmentShaderBarycentric(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV sType$Default() { return sType(NVFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentShaderBarycentric} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV set(
        int sType,
        long pNext,
        boolean fragmentShaderBarycentric
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShaderBarycentric(fragmentShaderBarycentric);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV set(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #fragmentShaderBarycentric}. */
    public static int nfragmentShaderBarycentric(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.FRAGMENTSHADERBARYCENTRIC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #fragmentShaderBarycentric(boolean) fragmentShaderBarycentric}. */
    public static void nfragmentShaderBarycentric(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.FRAGMENTSHADERBARYCENTRIC, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#fragmentShaderBarycentric} field. */
        @NativeType("VkBool32")
        public boolean fragmentShaderBarycentric() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nfragmentShaderBarycentric(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV} value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer sType$Default() { return sType(NVFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#pNext} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV#fragmentShaderBarycentric} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.Buffer fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV.nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    }

}
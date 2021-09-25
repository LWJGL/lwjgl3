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
 * Structure describing if fetching of vertex attribute may be repeated for instanced rendering.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #vertexAttributeInstanceRateDivisor};
 *     VkBool32 {@link #vertexAttributeInstanceRateZeroDivisor};
 * }</code></pre>
 */
public class VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VERTEXATTRIBUTEINSTANCERATEDIVISOR,
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXATTRIBUTEINSTANCERATEDIVISOR = layout.offsetof(2);
        VERTEXATTRIBUTEINSTANCERATEZERODIVISOR = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT(ByteBuffer container) {
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
    /** specifies whether vertex attribute fetching may be repeated in case of instanced rendering. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateDivisor() { return nvertexAttributeInstanceRateDivisor(address()) != 0; }
    /** specifies whether a zero value for {@link VkVertexInputBindingDivisorDescriptionEXT}{@code ::divisor} is supported. */
    @NativeType("VkBool32")
    public boolean vertexAttributeInstanceRateZeroDivisor() { return nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexAttributeInstanceRateDivisor} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #vertexAttributeInstanceRateZeroDivisor} field. */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT set(
        int sType,
        long pNext,
        boolean vertexAttributeInstanceRateDivisor,
        boolean vertexAttributeInstanceRateZeroDivisor
    ) {
        sType(sType);
        pNext(pNext);
        vertexAttributeInstanceRateDivisor(vertexAttributeInstanceRateDivisor);
        vertexAttributeInstanceRateZeroDivisor(vertexAttributeInstanceRateZeroDivisor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT set(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor}. */
    public static int nvertexAttributeInstanceRateDivisor(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.VERTEXATTRIBUTEINSTANCERATEDIVISOR); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor}. */
    public static int nvertexAttributeInstanceRateZeroDivisor(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateDivisor(boolean) vertexAttributeInstanceRateDivisor}. */
    public static void nvertexAttributeInstanceRateDivisor(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.VERTEXATTRIBUTEINSTANCERATEDIVISOR, value); }
    /** Unsafe version of {@link #vertexAttributeInstanceRateZeroDivisor(boolean) vertexAttributeInstanceRateZeroDivisor}. */
    public static void nvertexAttributeInstanceRateZeroDivisor(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.VERTEXATTRIBUTEINSTANCERATEZERODIVISOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#vertexAttributeInstanceRateDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateDivisor() { return VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nvertexAttributeInstanceRateDivisor(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#vertexAttributeInstanceRateZeroDivisor} field. */
        @NativeType("VkBool32")
        public boolean vertexAttributeInstanceRateZeroDivisor() { return VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nvertexAttributeInstanceRateZeroDivisor(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVertexAttributeDivisor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT} value to the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#sType} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer sType$Default() { return sType(EXTVertexAttributeDivisor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#vertexAttributeInstanceRateDivisor} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer vertexAttributeInstanceRateDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nvertexAttributeInstanceRateDivisor(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT#vertexAttributeInstanceRateZeroDivisor} field. */
        public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.Buffer vertexAttributeInstanceRateZeroDivisor(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT.nvertexAttributeInstanceRateZeroDivisor(address(), value ? 1 : 0); return this; }

    }

}
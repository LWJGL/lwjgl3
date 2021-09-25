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
 * Structure describing supported external fence handle features.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is not supported by the implementation, then {@link VkExternalFenceProperties}{@code ::externalFenceFeatures} will be set to zero.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetPhysicalDeviceExternalFenceProperties GetPhysicalDeviceExternalFenceProperties}, {@link KHRExternalFenceCapabilities#vkGetPhysicalDeviceExternalFencePropertiesKHR GetPhysicalDeviceExternalFencePropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalFenceProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalFenceHandleTypeFlags {@link #exportFromImportedHandleTypes};
 *     VkExternalFenceHandleTypeFlags {@link #compatibleHandleTypes};
 *     VkExternalFenceFeatureFlags {@link #externalFenceFeatures};
 * }</code></pre>
 */
public class VkExternalFenceProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        EXPORTFROMIMPORTEDHANDLETYPES,
        COMPATIBLEHANDLETYPES,
        EXTERNALFENCEFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(2);
        COMPATIBLEHANDLETYPES = layout.offsetof(3);
        EXTERNALFENCEFEATURES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkExternalFenceProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalFenceProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkExternalFenceHandleTypeFlagBits} indicating which types of imported handle {@code handleType} <b>can</b> be exported from. */
    @NativeType("VkExternalFenceHandleTypeFlags")
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** a bitmask of {@code VkExternalFenceHandleTypeFlagBits} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating a fence. */
    @NativeType("VkExternalFenceHandleTypeFlags")
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }
    /** a bitmask of {@code VkExternalFenceFeatureFlagBits} indicating the features of {@code handleType}. */
    @NativeType("VkExternalFenceFeatureFlags")
    public int externalFenceFeatures() { return nexternalFenceFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalFenceProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES} value to the {@code sType} field. */
    public VkExternalFenceProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalFenceProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalFenceProperties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExternalFenceProperties set(VkExternalFenceProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalFenceProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalFenceProperties malloc() {
        return wrap(VkExternalFenceProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExternalFenceProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalFenceProperties calloc() {
        return wrap(VkExternalFenceProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExternalFenceProperties} instance allocated with {@link BufferUtils}. */
    public static VkExternalFenceProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExternalFenceProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExternalFenceProperties} instance for the specified memory address. */
    public static VkExternalFenceProperties create(long address) {
        return wrap(VkExternalFenceProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalFenceProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkExternalFenceProperties.class, address);
    }

    /**
     * Returns a new {@link VkExternalFenceProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalFenceProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalFenceProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalFenceProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFenceProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalFenceProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExternalFenceProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalFenceProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalFenceProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkExternalFenceProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkExternalFenceProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalFenceProperties malloc(MemoryStack stack) {
        return wrap(VkExternalFenceProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExternalFenceProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalFenceProperties calloc(MemoryStack stack) {
        return wrap(VkExternalFenceProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalFenceProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalFenceProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalFenceProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalFenceProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExternalFenceProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalFenceProperties.PNEXT); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalFenceProperties.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalFenceProperties.COMPATIBLEHANDLETYPES); }
    /** Unsafe version of {@link #externalFenceFeatures}. */
    public static int nexternalFenceFeatures(long struct) { return UNSAFE.getInt(null, struct + VkExternalFenceProperties.EXTERNALFENCEFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalFenceProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalFenceProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkExternalFenceProperties} structs. */
    public static class Buffer extends StructBuffer<VkExternalFenceProperties, Buffer> implements NativeResource {

        private static final VkExternalFenceProperties ELEMENT_FACTORY = VkExternalFenceProperties.create(-1L);

        /**
         * Creates a new {@code VkExternalFenceProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalFenceProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalFenceProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalFenceProperties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalFenceProperties.npNext(address()); }
        /** @return the value of the {@link VkExternalFenceProperties#exportFromImportedHandleTypes} field. */
        @NativeType("VkExternalFenceHandleTypeFlags")
        public int exportFromImportedHandleTypes() { return VkExternalFenceProperties.nexportFromImportedHandleTypes(address()); }
        /** @return the value of the {@link VkExternalFenceProperties#compatibleHandleTypes} field. */
        @NativeType("VkExternalFenceHandleTypeFlags")
        public int compatibleHandleTypes() { return VkExternalFenceProperties.ncompatibleHandleTypes(address()); }
        /** @return the value of the {@link VkExternalFenceProperties#externalFenceFeatures} field. */
        @NativeType("VkExternalFenceFeatureFlags")
        public int externalFenceFeatures() { return VkExternalFenceProperties.nexternalFenceFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalFenceProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalFenceProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES} value to the {@code sType} field. */
        public VkExternalFenceProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalFenceProperties.Buffer pNext(@NativeType("void *") long value) { VkExternalFenceProperties.npNext(address(), value); return this; }

    }

}
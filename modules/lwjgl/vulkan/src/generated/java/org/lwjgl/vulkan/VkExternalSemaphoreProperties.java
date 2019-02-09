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
 * Structure describing supported external semaphore handle features.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is not supported by the implementation, then {@link VkExternalSemaphoreProperties}{@code ::externalSemaphoreFeatures} will be set to zero.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkGetPhysicalDeviceExternalSemaphoreProperties GetPhysicalDeviceExternalSemaphoreProperties}, {@link KHRExternalSemaphoreCapabilities#vkGetPhysicalDeviceExternalSemaphorePropertiesKHR GetPhysicalDeviceExternalSemaphorePropertiesKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code exportFromImportedHandleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBits} specifying which types of imported handle {@code handleType} <b>can</b> be exported from.</li>
 * <li>{@code compatibleHandleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBits} specifying handle types which <b>can</b> be specified at the same time as {@code handleType} when creating a semaphore.</li>
 * <li>{@code externalSemaphoreFeatures} &ndash; a bitmask of {@code VkExternalSemaphoreFeatureFlagBits} describing the features of {@code handleType}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExternalSemaphoreProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
 *     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
 *     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
 * }</code></pre>
 */
public class VkExternalSemaphoreProperties extends Struct implements NativeResource {

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
        EXTERNALSEMAPHOREFEATURES;

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
        EXTERNALSEMAPHOREFEATURES = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkExternalSemaphoreProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExternalSemaphoreProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
    @NativeType("VkExternalSemaphoreHandleTypeFlags")
    public int exportFromImportedHandleTypes() { return nexportFromImportedHandleTypes(address()); }
    /** Returns the value of the {@code compatibleHandleTypes} field. */
    @NativeType("VkExternalSemaphoreHandleTypeFlags")
    public int compatibleHandleTypes() { return ncompatibleHandleTypes(address()); }
    /** Returns the value of the {@code externalSemaphoreFeatures} field. */
    @NativeType("VkExternalSemaphoreFeatureFlags")
    public int externalSemaphoreFeatures() { return nexternalSemaphoreFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExternalSemaphoreProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExternalSemaphoreProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExternalSemaphoreProperties set(
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
    public VkExternalSemaphoreProperties set(VkExternalSemaphoreProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalSemaphoreProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphoreProperties malloc() {
        return wrap(VkExternalSemaphoreProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkExternalSemaphoreProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExternalSemaphoreProperties calloc() {
        return wrap(VkExternalSemaphoreProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkExternalSemaphoreProperties} instance allocated with {@link BufferUtils}. */
    public static VkExternalSemaphoreProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkExternalSemaphoreProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkExternalSemaphoreProperties} instance for the specified memory address. */
    public static VkExternalSemaphoreProperties create(long address) {
        return wrap(VkExternalSemaphoreProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalSemaphoreProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkExternalSemaphoreProperties.class, address);
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkExternalSemaphoreProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExternalSemaphoreProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkExternalSemaphoreProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkExternalSemaphoreProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkExternalSemaphoreProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkExternalSemaphoreProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkExternalSemaphoreProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphoreProperties mallocStack(MemoryStack stack) {
        return wrap(VkExternalSemaphoreProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkExternalSemaphoreProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExternalSemaphoreProperties callocStack(MemoryStack stack) {
        return wrap(VkExternalSemaphoreProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExternalSemaphoreProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExternalSemaphoreProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExternalSemaphoreProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExternalSemaphoreProperties.PNEXT); }
    /** Unsafe version of {@link #exportFromImportedHandleTypes}. */
    public static int nexportFromImportedHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalSemaphoreProperties.EXPORTFROMIMPORTEDHANDLETYPES); }
    /** Unsafe version of {@link #compatibleHandleTypes}. */
    public static int ncompatibleHandleTypes(long struct) { return UNSAFE.getInt(null, struct + VkExternalSemaphoreProperties.COMPATIBLEHANDLETYPES); }
    /** Unsafe version of {@link #externalSemaphoreFeatures}. */
    public static int nexternalSemaphoreFeatures(long struct) { return UNSAFE.getInt(null, struct + VkExternalSemaphoreProperties.EXTERNALSEMAPHOREFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExternalSemaphoreProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalSemaphoreProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkExternalSemaphoreProperties} structs. */
    public static class Buffer extends StructBuffer<VkExternalSemaphoreProperties, Buffer> implements NativeResource {

        private static final VkExternalSemaphoreProperties ELEMENT_FACTORY = VkExternalSemaphoreProperties.create(-1L);

        /**
         * Creates a new {@code VkExternalSemaphoreProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExternalSemaphoreProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkExternalSemaphoreProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExternalSemaphoreProperties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkExternalSemaphoreProperties.npNext(address()); }
        /** Returns the value of the {@code exportFromImportedHandleTypes} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlags")
        public int exportFromImportedHandleTypes() { return VkExternalSemaphoreProperties.nexportFromImportedHandleTypes(address()); }
        /** Returns the value of the {@code compatibleHandleTypes} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlags")
        public int compatibleHandleTypes() { return VkExternalSemaphoreProperties.ncompatibleHandleTypes(address()); }
        /** Returns the value of the {@code externalSemaphoreFeatures} field. */
        @NativeType("VkExternalSemaphoreFeatureFlags")
        public int externalSemaphoreFeatures() { return VkExternalSemaphoreProperties.nexternalSemaphoreFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExternalSemaphoreProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkExternalSemaphoreProperties.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExternalSemaphoreProperties.Buffer pNext(@NativeType("void *") long value) { VkExternalSemaphoreProperties.npNext(address(), value); return this; }

    }

}
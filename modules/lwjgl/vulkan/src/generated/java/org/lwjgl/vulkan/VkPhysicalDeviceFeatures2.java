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
 * Structure describing the fine-grained features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code pNext} chain of this structure is used to extend the structure with features defined by extensions. This structure <b>can</b> be used in {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2} or <b>can</b> be in the {@code pNext} chain of a {@link VkDeviceCreateInfo} structure, in which case it controls which features are enabled in the device in lieu of {@code pEnabledFeatures}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceFeatures}, {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code features} &ndash; a structure of type {@link VkPhysicalDeviceFeatures} describing the fine-grained features of the Vulkan 1.0 API.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFeatures2 {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} features;
 * }</code></pre>
 */
public class VkPhysicalDeviceFeatures2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceFeatures.SIZEOF, VkPhysicalDeviceFeatures.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FEATURES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFeatures2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFeatures2(ByteBuffer container) {
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
    /** Returns a {@link VkPhysicalDeviceFeatures} view of the {@code features} field. */
    public VkPhysicalDeviceFeatures features() { return nfeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFeatures2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceFeatures2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
    public VkPhysicalDeviceFeatures2 features(VkPhysicalDeviceFeatures value) { nfeatures(address(), value); return this; }
    /** Passes the {@code features} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPhysicalDeviceFeatures2 features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFeatures2 set(
        int sType,
        long pNext,
        VkPhysicalDeviceFeatures features
    ) {
        sType(sType);
        pNext(pNext);
        features(features);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFeatures2 set(VkPhysicalDeviceFeatures2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2 malloc() {
        return wrap(VkPhysicalDeviceFeatures2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFeatures2 calloc() {
        return wrap(VkPhysicalDeviceFeatures2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFeatures2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFeatures2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance for the specified memory address. */
    public static VkPhysicalDeviceFeatures2 create(long address) {
        return wrap(VkPhysicalDeviceFeatures2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFeatures2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFeatures2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFeatures2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceFeatures2 mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceFeatures2 callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2 mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFeatures2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFeatures2 callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFeatures2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFeatures2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFeatures2.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFeatures2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFeatures2.PNEXT); }
    /** Unsafe version of {@link #features}. */
    public static VkPhysicalDeviceFeatures nfeatures(long struct) { return VkPhysicalDeviceFeatures.create(struct + VkPhysicalDeviceFeatures2.FEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFeatures2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFeatures2.PNEXT, value); }
    /** Unsafe version of {@link #features(VkPhysicalDeviceFeatures) features}. */
    public static void nfeatures(long struct, VkPhysicalDeviceFeatures value) { memCopy(value.address(), struct + VkPhysicalDeviceFeatures2.FEATURES, VkPhysicalDeviceFeatures.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFeatures2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFeatures2 ELEMENT_FACTORY = VkPhysicalDeviceFeatures2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFeatures2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFeatures2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFeatures2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFeatures2.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFeatures2.npNext(address()); }
        /** Returns a {@link VkPhysicalDeviceFeatures} view of the {@code features} field. */
        public VkPhysicalDeviceFeatures features() { return VkPhysicalDeviceFeatures2.nfeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFeatures2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFeatures2.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFeatures2.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFeatures2.npNext(address(), value); return this; }
        /** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
        public VkPhysicalDeviceFeatures2.Buffer features(VkPhysicalDeviceFeatures value) { VkPhysicalDeviceFeatures2.nfeatures(address(), value); return this; }
        /** Passes the {@code features} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPhysicalDeviceFeatures2.Buffer features(java.util.function.Consumer<VkPhysicalDeviceFeatures> consumer) { consumer.accept(features()); return this; }

    }

}
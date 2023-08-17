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
 * Structure describing whether the mutable descriptor type is supported.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #mutableDescriptorType};
 * }</code></pre>
 */
public class VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT extends Struct<VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MUTABLEDESCRIPTORTYPE;

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
        MUTABLEDESCRIPTORTYPE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /**
     * indicates that the implementation <b>must</b> support using the {@code VkDescriptorType} of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT} with at least the following descriptor types, where any combination of the types <b>must</b> be supported:
     * 
     * <ul>
     * <li>{@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}</li>
     * <li>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}</li>
     * <li>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}</li>
     * <li>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}</li>
     * <li>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}</li>
     * <li>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}</li>
     * </ul>
     * 
     * <p>Additionally, {@code mutableDescriptorType} indicates that:</p>
     * 
     * <ul>
     * <li>Non-uniform descriptor indexing <b>must</b> be supported if all descriptor types in a {@link VkMutableDescriptorTypeListEXT} for {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT} have the corresponding non-uniform indexing features enabled in {@link VkPhysicalDeviceDescriptorIndexingFeatures}.</li>
     * <li>{@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} with {@code descriptorType} of {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT} relaxes the list of required descriptor types to the descriptor types which have the corresponding update-after-bind feature enabled in {@link VkPhysicalDeviceDescriptorIndexingFeatures}.</li>
     * <li>Dynamically uniform descriptor indexing <b>must</b> be supported if all descriptor types in a {@link VkMutableDescriptorTypeListEXT} for {@link EXTMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_EXT DESCRIPTOR_TYPE_MUTABLE_EXT} have the corresponding dynamic indexing features enabled.</li>
     * <li>{@link EXTMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT} <b>must</b> be supported.</li>
     * <li>{@link EXTMutableDescriptorType#VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT} <b>must</b> be supported.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean mutableDescriptorType() { return nmutableDescriptorType(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mutableDescriptorType} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT mutableDescriptorType(@NativeType("VkBool32") boolean value) { nmutableDescriptorType(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT set(
        int sType,
        long pNext,
        boolean mutableDescriptorType
    ) {
        sType(sType);
        pNext(pNext);
        mutableDescriptorType(mutableDescriptorType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT set(VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT malloc() {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT calloc() {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #mutableDescriptorType}. */
    public static int nmutableDescriptorType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.MUTABLEDESCRIPTORTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #mutableDescriptorType(boolean) mutableDescriptorType}. */
    public static void nmutableDescriptorType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.MUTABLEDESCRIPTORTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#mutableDescriptorType} field. */
        @NativeType("VkBool32")
        public boolean mutableDescriptorType() { return VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.nmutableDescriptorType(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#sType} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT} value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#sType} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer sType$Default() { return sType(EXTMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT#mutableDescriptorType} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.Buffer mutableDescriptorType(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT.nmutableDescriptorType(address(), value ? 1 : 0); return this; }

    }

}
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
 * <p>If the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VALVEMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #mutableDescriptorType};
 * }</code></pre>
 */
public class VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE(ByteBuffer container) {
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
    /**
     * indicates that the implementation <b>must</b> support using the {@code VkDescriptorType} of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} with at least the following descriptor types, where any combination of the types <b>must</b> be supported:
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
     * <li>Non-uniform descriptor indexing <b>must</b> be supported if all descriptor types in a {@link VkMutableDescriptorTypeListVALVE} for {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} have the corresponding non-uniform indexing features enabled in {@link VkPhysicalDeviceDescriptorIndexingFeatures}.</li>
     * <li>{@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} with {@code descriptorType} of {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} relaxes the list of required descriptor types to the descriptor types which have the corresponding update-after-bind feature enabled in {@link VkPhysicalDeviceDescriptorIndexingFeatures}.</li>
     * <li>Dynamically uniform descriptor indexing <b>must</b> be supported if all descriptor types in a {@link VkMutableDescriptorTypeListVALVE} for {@link VALVEMutableDescriptorType#VK_DESCRIPTOR_TYPE_MUTABLE_VALVE DESCRIPTOR_TYPE_MUTABLE_VALVE} have the corresponding dynamic indexing features enabled.</li>
     * <li>{@link VALVEMutableDescriptorType#VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_VALVE} <b>must</b> be supported.</li>
     * <li>{@link VALVEMutableDescriptorType#VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_VALVE} <b>must</b> be supported.</li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean mutableDescriptorType() { return nmutableDescriptorType(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE} value to the {@link #sType} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE sType$Default() { return sType(VALVEMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mutableDescriptorType} field. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE mutableDescriptorType(@NativeType("VkBool32") boolean value) { nmutableDescriptorType(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE set(
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
    public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE set(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE malloc() {
        return wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE calloc() {
        return wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance for the specified memory address. */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE create(long address) {
        return wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.PNEXT); }
    /** Unsafe version of {@link #mutableDescriptorType}. */
    public static int nmutableDescriptorType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.MUTABLEDESCRIPTORTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.PNEXT, value); }
    /** Unsafe version of {@link #mutableDescriptorType(boolean) mutableDescriptorType}. */
    public static void nmutableDescriptorType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.MUTABLEDESCRIPTORTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#mutableDescriptorType} field. */
        @NativeType("VkBool32")
        public boolean mutableDescriptorType() { return VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nmutableDescriptorType(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#sType} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEMutableDescriptorType#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE} value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#sType} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer sType$Default() { return sType(VALVEMutableDescriptorType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MUTABLE_DESCRIPTOR_TYPE_FEATURES_VALVE); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#pNext} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE#mutableDescriptorType} field. */
        public VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.Buffer mutableDescriptorType(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE.nmutableDescriptorType(address(), value ? 1 : 0); return this; }

    }

}
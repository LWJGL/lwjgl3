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
 * Structure describing the device-generated commands features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #deviceGeneratedCommands};
 * }</code></pre>
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEGENERATEDCOMMANDS;

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
        DEVICEGENERATEDCOMMANDS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports functionality to generate commands on the device. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#device-generated-commands">Device-Generated Commands</a>. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedCommands() { return ndeviceGeneratedCommands(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #deviceGeneratedCommands} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV deviceGeneratedCommands(@NativeType("VkBool32") boolean value) { ndeviceGeneratedCommands(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV set(
        int sType,
        long pNext,
        boolean deviceGeneratedCommands
    ) {
        sType(sType);
        pNext(pNext);
        deviceGeneratedCommands(deviceGeneratedCommands);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV set(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #deviceGeneratedCommands}. */
    public static int ndeviceGeneratedCommands(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.DEVICEGENERATEDCOMMANDS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #deviceGeneratedCommands(boolean) deviceGeneratedCommands}. */
    public static void ndeviceGeneratedCommands(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.DEVICEGENERATEDCOMMANDS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#deviceGeneratedCommands} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedCommands() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.ndeviceGeneratedCommands(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV} value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#pNext} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV#deviceGeneratedCommands} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.Buffer deviceGeneratedCommands(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV.ndeviceGeneratedCommands(address(), value ? 1 : 0); return this; }

    }

}
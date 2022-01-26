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
 * Structure describing the acceleration structure features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #accelerationStructure};
 *     VkBool32 {@link #accelerationStructureCaptureReplay};
 *     VkBool32 {@link #accelerationStructureIndirectBuild};
 *     VkBool32 {@link #accelerationStructureHostCommands};
 *     VkBool32 {@link #descriptorBindingAccelerationStructureUpdateAfterBind};
 * }</code></pre>
 */
public class VkPhysicalDeviceAccelerationStructureFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE,
        ACCELERATIONSTRUCTURECAPTUREREPLAY,
        ACCELERATIONSTRUCTUREINDIRECTBUILD,
        ACCELERATIONSTRUCTUREHOSTCOMMANDS,
        DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        ACCELERATIONSTRUCTURECAPTUREREPLAY = layout.offsetof(3);
        ACCELERATIONSTRUCTUREINDIRECTBUILD = layout.offsetof(4);
        ACCELERATIONSTRUCTUREHOSTCOMMANDS = layout.offsetof(5);
        DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(ByteBuffer container) {
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
    /** indicates whether the implementation supports the acceleration structure functionality. See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#acceleration-structure">Acceleration Structures</a>. */
    @NativeType("VkBool32")
    public boolean accelerationStructure() { return naccelerationStructure(address()) != 0; }
    /** indicates whether the implementation supports saving and reusing acceleration structure device addresses, e.g. for trace capture and replay. */
    @NativeType("VkBool32")
    public boolean accelerationStructureCaptureReplay() { return naccelerationStructureCaptureReplay(address()) != 0; }
    /** indicates whether the implementation supports indirect acceleration structure build commands, e.g. {@link KHRAccelerationStructure#vkCmdBuildAccelerationStructuresIndirectKHR CmdBuildAccelerationStructuresIndirectKHR}. */
    @NativeType("VkBool32")
    public boolean accelerationStructureIndirectBuild() { return naccelerationStructureIndirectBuild(address()) != 0; }
    /** indicates whether the implementation supports host side acceleration structure commands, e.g. {@link KHRAccelerationStructure#vkBuildAccelerationStructuresKHR BuildAccelerationStructuresKHR}, {@link KHRAccelerationStructure#vkCopyAccelerationStructureKHR CopyAccelerationStructureKHR}, {@link KHRAccelerationStructure#vkCopyAccelerationStructureToMemoryKHR CopyAccelerationStructureToMemoryKHR}, {@link KHRAccelerationStructure#vkCopyMemoryToAccelerationStructureKHR CopyMemoryToAccelerationStructureKHR}, {@link KHRAccelerationStructure#vkWriteAccelerationStructuresPropertiesKHR WriteAccelerationStructuresPropertiesKHR}. */
    @NativeType("VkBool32")
    public boolean accelerationStructureHostCommands() { return naccelerationStructureHostCommands(address()) != 0; }
    /** indicates whether the implementation supports updating acceleration structure descriptors after a set is bound. If this feature is not enabled, {@link VK12#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT} <b>must</b> not be used with {@link KHRAccelerationStructure#VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR}. */
    @NativeType("VkBool32")
    public boolean descriptorBindingAccelerationStructureUpdateAfterBind() { return ndescriptorBindingAccelerationStructureUpdateAfterBind(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #accelerationStructure} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(@NativeType("VkBool32") boolean value) { naccelerationStructure(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #accelerationStructureCaptureReplay} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(@NativeType("VkBool32") boolean value) { naccelerationStructureCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #accelerationStructureIndirectBuild} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(@NativeType("VkBool32") boolean value) { naccelerationStructureIndirectBuild(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #accelerationStructureHostCommands} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(@NativeType("VkBool32") boolean value) { naccelerationStructureHostCommands(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #descriptorBindingAccelerationStructureUpdateAfterBind} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndescriptorBindingAccelerationStructureUpdateAfterBind(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR set(
        int sType,
        long pNext,
        boolean accelerationStructure,
        boolean accelerationStructureCaptureReplay,
        boolean accelerationStructureIndirectBuild,
        boolean accelerationStructureHostCommands,
        boolean descriptorBindingAccelerationStructureUpdateAfterBind
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        accelerationStructureCaptureReplay(accelerationStructureCaptureReplay);
        accelerationStructureIndirectBuild(accelerationStructureIndirectBuild);
        accelerationStructureHostCommands(accelerationStructureHostCommands);
        descriptorBindingAccelerationStructureUpdateAfterBind(descriptorBindingAccelerationStructureUpdateAfterBind);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR set(VkPhysicalDeviceAccelerationStructureFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceAccelerationStructureFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static int naccelerationStructure(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #accelerationStructureCaptureReplay}. */
    public static int naccelerationStructureCaptureReplay(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURECAPTUREREPLAY); }
    /** Unsafe version of {@link #accelerationStructureIndirectBuild}. */
    public static int naccelerationStructureIndirectBuild(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREINDIRECTBUILD); }
    /** Unsafe version of {@link #accelerationStructureHostCommands}. */
    public static int naccelerationStructureHostCommands(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREHOSTCOMMANDS); }
    /** Unsafe version of {@link #descriptorBindingAccelerationStructureUpdateAfterBind}. */
    public static int ndescriptorBindingAccelerationStructureUpdateAfterBind(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(boolean) accelerationStructure}. */
    public static void naccelerationStructure(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #accelerationStructureCaptureReplay(boolean) accelerationStructureCaptureReplay}. */
    public static void naccelerationStructureCaptureReplay(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURECAPTUREREPLAY, value); }
    /** Unsafe version of {@link #accelerationStructureIndirectBuild(boolean) accelerationStructureIndirectBuild}. */
    public static void naccelerationStructureIndirectBuild(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREINDIRECTBUILD, value); }
    /** Unsafe version of {@link #accelerationStructureHostCommands(boolean) accelerationStructureHostCommands}. */
    public static void naccelerationStructureHostCommands(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREHOSTCOMMANDS, value); }
    /** Unsafe version of {@link #descriptorBindingAccelerationStructureUpdateAfterBind(boolean) descriptorBindingAccelerationStructureUpdateAfterBind}. */
    public static void ndescriptorBindingAccelerationStructureUpdateAfterBind(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAccelerationStructureFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAccelerationStructureFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceAccelerationStructureFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceAccelerationStructureFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructure} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructure() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructure(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructureCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructureCaptureReplay() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureCaptureReplay(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructureIndirectBuild} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructureIndirectBuild() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureIndirectBuild(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructureHostCommands} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructureHostCommands() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureHostCommands(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#descriptorBindingAccelerationStructureUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingAccelerationStructureUpdateAfterBind() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.ndescriptorBindingAccelerationStructureUpdateAfterBind(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#sType} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR} value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#sType} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructure} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructure(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructure(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructureCaptureReplay} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructureCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructureIndirectBuild} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructureIndirectBuild(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureIndirectBuild(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#accelerationStructureHostCommands} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructureHostCommands(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureHostCommands(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#descriptorBindingAccelerationStructureUpdateAfterBind} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer descriptorBindingAccelerationStructureUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.ndescriptorBindingAccelerationStructureUpdateAfterBind(address(), value ? 1 : 0); return this; }

    }

}
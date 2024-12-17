/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 accelerationStructure;
 *     VkBool32 accelerationStructureCaptureReplay;
 *     VkBool32 accelerationStructureIndirectBuild;
 *     VkBool32 accelerationStructureHostCommands;
 *     VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
 * }}</pre>
 */
public class VkPhysicalDeviceAccelerationStructureFeaturesKHR extends Struct<VkPhysicalDeviceAccelerationStructureFeaturesKHR> implements NativeResource {

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

    protected VkPhysicalDeviceAccelerationStructureFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceAccelerationStructureFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code accelerationStructure} field. */
    @NativeType("VkBool32")
    public boolean accelerationStructure() { return naccelerationStructure(address()) != 0; }
    /** @return the value of the {@code accelerationStructureCaptureReplay} field. */
    @NativeType("VkBool32")
    public boolean accelerationStructureCaptureReplay() { return naccelerationStructureCaptureReplay(address()) != 0; }
    /** @return the value of the {@code accelerationStructureIndirectBuild} field. */
    @NativeType("VkBool32")
    public boolean accelerationStructureIndirectBuild() { return naccelerationStructureIndirectBuild(address()) != 0; }
    /** @return the value of the {@code accelerationStructureHostCommands} field. */
    @NativeType("VkBool32")
    public boolean accelerationStructureHostCommands() { return naccelerationStructureHostCommands(address()) != 0; }
    /** @return the value of the {@code descriptorBindingAccelerationStructureUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean descriptorBindingAccelerationStructureUpdateAfterBind() { return ndescriptorBindingAccelerationStructureUpdateAfterBind(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(@NativeType("VkBool32") boolean value) { naccelerationStructure(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code accelerationStructureCaptureReplay} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(@NativeType("VkBool32") boolean value) { naccelerationStructureCaptureReplay(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code accelerationStructureIndirectBuild} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(@NativeType("VkBool32") boolean value) { naccelerationStructureIndirectBuild(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code accelerationStructureHostCommands} field. */
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(@NativeType("VkBool32") boolean value) { naccelerationStructureHostCommands(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code descriptorBindingAccelerationStructureUpdateAfterBind} field. */
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
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR calloc() {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR create(long address) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceAccelerationStructureFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceAccelerationStructureFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static int naccelerationStructure(long struct) { return memGetInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #accelerationStructureCaptureReplay}. */
    public static int naccelerationStructureCaptureReplay(long struct) { return memGetInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURECAPTUREREPLAY); }
    /** Unsafe version of {@link #accelerationStructureIndirectBuild}. */
    public static int naccelerationStructureIndirectBuild(long struct) { return memGetInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREINDIRECTBUILD); }
    /** Unsafe version of {@link #accelerationStructureHostCommands}. */
    public static int naccelerationStructureHostCommands(long struct) { return memGetInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREHOSTCOMMANDS); }
    /** Unsafe version of {@link #descriptorBindingAccelerationStructureUpdateAfterBind}. */
    public static int ndescriptorBindingAccelerationStructureUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(boolean) accelerationStructure}. */
    public static void naccelerationStructure(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #accelerationStructureCaptureReplay(boolean) accelerationStructureCaptureReplay}. */
    public static void naccelerationStructureCaptureReplay(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTURECAPTUREREPLAY, value); }
    /** Unsafe version of {@link #accelerationStructureIndirectBuild(boolean) accelerationStructureIndirectBuild}. */
    public static void naccelerationStructureIndirectBuild(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREINDIRECTBUILD, value); }
    /** Unsafe version of {@link #accelerationStructureHostCommands(boolean) accelerationStructureHostCommands}. */
    public static void naccelerationStructureHostCommands(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.ACCELERATIONSTRUCTUREHOSTCOMMANDS, value); }
    /** Unsafe version of {@link #descriptorBindingAccelerationStructureUpdateAfterBind(boolean) descriptorBindingAccelerationStructureUpdateAfterBind}. */
    public static void ndescriptorBindingAccelerationStructureUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceAccelerationStructureFeaturesKHR.DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAccelerationStructureFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAccelerationStructureFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceAccelerationStructureFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAccelerationStructureFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceAccelerationStructureFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code accelerationStructure} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructure() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructure(address()) != 0; }
        /** @return the value of the {@code accelerationStructureCaptureReplay} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructureCaptureReplay() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureCaptureReplay(address()) != 0; }
        /** @return the value of the {@code accelerationStructureIndirectBuild} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructureIndirectBuild() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureIndirectBuild(address()) != 0; }
        /** @return the value of the {@code accelerationStructureHostCommands} field. */
        @NativeType("VkBool32")
        public boolean accelerationStructureHostCommands() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureHostCommands(address()) != 0; }
        /** @return the value of the {@code descriptorBindingAccelerationStructureUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean descriptorBindingAccelerationStructureUpdateAfterBind() { return VkPhysicalDeviceAccelerationStructureFeaturesKHR.ndescriptorBindingAccelerationStructureUpdateAfterBind(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructure(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructure(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code accelerationStructureCaptureReplay} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructureCaptureReplay(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureCaptureReplay(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code accelerationStructureIndirectBuild} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructureIndirectBuild(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureIndirectBuild(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code accelerationStructureHostCommands} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer accelerationStructureHostCommands(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureHostCommands(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code descriptorBindingAccelerationStructureUpdateAfterBind} field. */
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR.Buffer descriptorBindingAccelerationStructureUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAccelerationStructureFeaturesKHR.ndescriptorBindingAccelerationStructureUpdateAfterBind(address(), value ? 1 : 0); return this; }

    }

}
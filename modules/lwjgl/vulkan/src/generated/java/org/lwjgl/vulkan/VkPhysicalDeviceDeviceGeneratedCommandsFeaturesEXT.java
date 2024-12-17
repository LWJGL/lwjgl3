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
 * struct VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 deviceGeneratedCommands;
 *     VkBool32 dynamicGeneratedPipelineLayout;
 * }}</pre>
 */
public class VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEGENERATEDCOMMANDS,
        DYNAMICGENERATEDPIPELINELAYOUT;

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
        DEVICEGENERATEDCOMMANDS = layout.offsetof(2);
        DYNAMICGENERATEDPIPELINELAYOUT = layout.offsetof(3);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code deviceGeneratedCommands} field. */
    @NativeType("VkBool32")
    public boolean deviceGeneratedCommands() { return ndeviceGeneratedCommands(address()) != 0; }
    /** @return the value of the {@code dynamicGeneratedPipelineLayout} field. */
    @NativeType("VkBool32")
    public boolean dynamicGeneratedPipelineLayout() { return ndynamicGeneratedPipelineLayout(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code deviceGeneratedCommands} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT deviceGeneratedCommands(@NativeType("VkBool32") boolean value) { ndeviceGeneratedCommands(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dynamicGeneratedPipelineLayout} field. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT dynamicGeneratedPipelineLayout(@NativeType("VkBool32") boolean value) { ndynamicGeneratedPipelineLayout(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT set(
        int sType,
        long pNext,
        boolean deviceGeneratedCommands,
        boolean dynamicGeneratedPipelineLayout
    ) {
        sType(sType);
        pNext(pNext);
        deviceGeneratedCommands(deviceGeneratedCommands);
        dynamicGeneratedPipelineLayout(dynamicGeneratedPipelineLayout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT set(VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #deviceGeneratedCommands}. */
    public static int ndeviceGeneratedCommands(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.DEVICEGENERATEDCOMMANDS); }
    /** Unsafe version of {@link #dynamicGeneratedPipelineLayout}. */
    public static int ndynamicGeneratedPipelineLayout(long struct) { return memGetInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.DYNAMICGENERATEDPIPELINELAYOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #deviceGeneratedCommands(boolean) deviceGeneratedCommands}. */
    public static void ndeviceGeneratedCommands(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.DEVICEGENERATEDCOMMANDS, value); }
    /** Unsafe version of {@link #dynamicGeneratedPipelineLayout(boolean) dynamicGeneratedPipelineLayout}. */
    public static void ndynamicGeneratedPipelineLayout(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.DYNAMICGENERATEDPIPELINELAYOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code deviceGeneratedCommands} field. */
        @NativeType("VkBool32")
        public boolean deviceGeneratedCommands() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndeviceGeneratedCommands(address()) != 0; }
        /** @return the value of the {@code dynamicGeneratedPipelineLayout} field. */
        @NativeType("VkBool32")
        public boolean dynamicGeneratedPipelineLayout() { return VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndynamicGeneratedPipelineLayout(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code deviceGeneratedCommands} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer deviceGeneratedCommands(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndeviceGeneratedCommands(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dynamicGeneratedPipelineLayout} field. */
        public VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.Buffer dynamicGeneratedPipelineLayout(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.ndynamicGeneratedPipelineLayout(address(), value ? 1 : 0); return this; }

    }

}
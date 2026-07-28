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
 * struct VkPhysicalDeviceDataGraphFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dataGraph;
 *     VkBool32 dataGraphUpdateAfterBind;
 *     VkBool32 dataGraphSpecializationConstants;
 *     VkBool32 dataGraphDescriptorBuffer;
 *     VkBool32 dataGraphShaderModule;
 * }}</pre>
 */
public class VkPhysicalDeviceDataGraphFeaturesARM extends Struct<VkPhysicalDeviceDataGraphFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATAGRAPH,
        DATAGRAPHUPDATEAFTERBIND,
        DATAGRAPHSPECIALIZATIONCONSTANTS,
        DATAGRAPHDESCRIPTORBUFFER,
        DATAGRAPHSHADERMODULE;

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
        DATAGRAPH = layout.offsetof(2);
        DATAGRAPHUPDATEAFTERBIND = layout.offsetof(3);
        DATAGRAPHSPECIALIZATIONCONSTANTS = layout.offsetof(4);
        DATAGRAPHDESCRIPTORBUFFER = layout.offsetof(5);
        DATAGRAPHSHADERMODULE = layout.offsetof(6);
    }

    protected VkPhysicalDeviceDataGraphFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDataGraphFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDataGraphFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDataGraphFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code dataGraph} field. */
    @NativeType("VkBool32")
    public boolean dataGraph() { return ndataGraph(address()) != 0; }
    /** @return the value of the {@code dataGraphUpdateAfterBind} field. */
    @NativeType("VkBool32")
    public boolean dataGraphUpdateAfterBind() { return ndataGraphUpdateAfterBind(address()) != 0; }
    /** @return the value of the {@code dataGraphSpecializationConstants} field. */
    @NativeType("VkBool32")
    public boolean dataGraphSpecializationConstants() { return ndataGraphSpecializationConstants(address()) != 0; }
    /** @return the value of the {@code dataGraphDescriptorBuffer} field. */
    @NativeType("VkBool32")
    public boolean dataGraphDescriptorBuffer() { return ndataGraphDescriptorBuffer(address()) != 0; }
    /** @return the value of the {@code dataGraphShaderModule} field. */
    @NativeType("VkBool32")
    public boolean dataGraphShaderModule() { return ndataGraphShaderModule(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dataGraph} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraph(@NativeType("VkBool32") boolean value) { ndataGraph(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dataGraphUpdateAfterBind} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphUpdateAfterBind(@NativeType("VkBool32") boolean value) { ndataGraphUpdateAfterBind(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dataGraphSpecializationConstants} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphSpecializationConstants(@NativeType("VkBool32") boolean value) { ndataGraphSpecializationConstants(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dataGraphDescriptorBuffer} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphDescriptorBuffer(@NativeType("VkBool32") boolean value) { ndataGraphDescriptorBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dataGraphShaderModule} field. */
    public VkPhysicalDeviceDataGraphFeaturesARM dataGraphShaderModule(@NativeType("VkBool32") boolean value) { ndataGraphShaderModule(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDataGraphFeaturesARM set(
        int sType,
        long pNext,
        boolean dataGraph,
        boolean dataGraphUpdateAfterBind,
        boolean dataGraphSpecializationConstants,
        boolean dataGraphDescriptorBuffer,
        boolean dataGraphShaderModule
    ) {
        sType(sType);
        pNext(pNext);
        dataGraph(dataGraph);
        dataGraphUpdateAfterBind(dataGraphUpdateAfterBind);
        dataGraphSpecializationConstants(dataGraphSpecializationConstants);
        dataGraphDescriptorBuffer(dataGraphDescriptorBuffer);
        dataGraphShaderModule(dataGraphShaderModule);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDataGraphFeaturesARM set(VkPhysicalDeviceDataGraphFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDataGraphFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphFeaturesARM malloc() {
        return new VkPhysicalDeviceDataGraphFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphFeaturesARM calloc() {
        return new VkPhysicalDeviceDataGraphFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDataGraphFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDataGraphFeaturesARM create(long address) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDataGraphFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDataGraphFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDataGraphFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDataGraphFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #dataGraph}. */
    public static int ndataGraph(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPH); }
    /** Unsafe version of {@link #dataGraphUpdateAfterBind}. */
    public static int ndataGraphUpdateAfterBind(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHUPDATEAFTERBIND); }
    /** Unsafe version of {@link #dataGraphSpecializationConstants}. */
    public static int ndataGraphSpecializationConstants(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHSPECIALIZATIONCONSTANTS); }
    /** Unsafe version of {@link #dataGraphDescriptorBuffer}. */
    public static int ndataGraphDescriptorBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHDESCRIPTORBUFFER); }
    /** Unsafe version of {@link #dataGraphShaderModule}. */
    public static int ndataGraphShaderModule(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHSHADERMODULE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDataGraphFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #dataGraph(boolean) dataGraph}. */
    public static void ndataGraph(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPH, value); }
    /** Unsafe version of {@link #dataGraphUpdateAfterBind(boolean) dataGraphUpdateAfterBind}. */
    public static void ndataGraphUpdateAfterBind(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHUPDATEAFTERBIND, value); }
    /** Unsafe version of {@link #dataGraphSpecializationConstants(boolean) dataGraphSpecializationConstants}. */
    public static void ndataGraphSpecializationConstants(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHSPECIALIZATIONCONSTANTS, value); }
    /** Unsafe version of {@link #dataGraphDescriptorBuffer(boolean) dataGraphDescriptorBuffer}. */
    public static void ndataGraphDescriptorBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHDESCRIPTORBUFFER, value); }
    /** Unsafe version of {@link #dataGraphShaderModule(boolean) dataGraphShaderModule}. */
    public static void ndataGraphShaderModule(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphFeaturesARM.DATAGRAPHSHADERMODULE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDataGraphFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDataGraphFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDataGraphFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDataGraphFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDataGraphFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDataGraphFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDataGraphFeaturesARM.npNext(address()); }
        /** @return the value of the {@code dataGraph} field. */
        @NativeType("VkBool32")
        public boolean dataGraph() { return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraph(address()) != 0; }
        /** @return the value of the {@code dataGraphUpdateAfterBind} field. */
        @NativeType("VkBool32")
        public boolean dataGraphUpdateAfterBind() { return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphUpdateAfterBind(address()) != 0; }
        /** @return the value of the {@code dataGraphSpecializationConstants} field. */
        @NativeType("VkBool32")
        public boolean dataGraphSpecializationConstants() { return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphSpecializationConstants(address()) != 0; }
        /** @return the value of the {@code dataGraphDescriptorBuffer} field. */
        @NativeType("VkBool32")
        public boolean dataGraphDescriptorBuffer() { return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphDescriptorBuffer(address()) != 0; }
        /** @return the value of the {@code dataGraphShaderModule} field. */
        @NativeType("VkBool32")
        public boolean dataGraphShaderModule() { return VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphShaderModule(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDataGraphFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDataGraphFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dataGraph} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer dataGraph(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphFeaturesARM.ndataGraph(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dataGraphUpdateAfterBind} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer dataGraphUpdateAfterBind(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphUpdateAfterBind(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dataGraphSpecializationConstants} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer dataGraphSpecializationConstants(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphSpecializationConstants(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dataGraphDescriptorBuffer} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer dataGraphDescriptorBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphDescriptorBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dataGraphShaderModule} field. */
        public VkPhysicalDeviceDataGraphFeaturesARM.Buffer dataGraphShaderModule(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphFeaturesARM.ndataGraphShaderModule(address(), value ? 1 : 0); return this; }

    }

}
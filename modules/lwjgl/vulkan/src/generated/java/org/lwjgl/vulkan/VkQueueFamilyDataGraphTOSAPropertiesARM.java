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
 * <pre><code>
 * struct VkQueueFamilyDataGraphTOSAPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t profileCount;
 *     {@link VkDataGraphTOSANameQualityARM VkDataGraphTOSANameQualityARM} const * pProfiles;
 *     uint32_t extensionCount;
 *     {@link VkDataGraphTOSANameQualityARM VkDataGraphTOSANameQualityARM} const * pExtensions;
 *     VkDataGraphTOSALevelARM level;
 * }</code></pre>
 */
public class VkQueueFamilyDataGraphTOSAPropertiesARM extends Struct<VkQueueFamilyDataGraphTOSAPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROFILECOUNT,
        PPROFILES,
        EXTENSIONCOUNT,
        PEXTENSIONS,
        LEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROFILECOUNT = layout.offsetof(2);
        PPROFILES = layout.offsetof(3);
        EXTENSIONCOUNT = layout.offsetof(4);
        PEXTENSIONS = layout.offsetof(5);
        LEVEL = layout.offsetof(6);
    }

    protected VkQueueFamilyDataGraphTOSAPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyDataGraphTOSAPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyDataGraphTOSAPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code profileCount} field. */
    @NativeType("uint32_t")
    public int profileCount() { return nprofileCount(address()); }
    /** @return a {@link VkDataGraphTOSANameQualityARM.Buffer} view of the struct array pointed to by the {@code pProfiles} field. */
    @NativeType("VkDataGraphTOSANameQualityARM const *")
    public VkDataGraphTOSANameQualityARM.Buffer pProfiles() { return npProfiles(address()); }
    /** @return the value of the {@code extensionCount} field. */
    @NativeType("uint32_t")
    public int extensionCount() { return nextensionCount(address()); }
    /** @return a {@link VkDataGraphTOSANameQualityARM.Buffer} view of the struct array pointed to by the {@code pExtensions} field. */
    @NativeType("VkDataGraphTOSANameQualityARM const *")
    public VkDataGraphTOSANameQualityARM.Buffer pExtensions() { return npExtensions(address()); }
    /** @return the value of the {@code level} field. */
    @NativeType("VkDataGraphTOSALevelARM")
    public int level() { return nlevel(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyDataGraphTOSAPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraphInstructionSetTosa#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkQueueFamilyDataGraphTOSAPropertiesARM sType$Default() { return sType(ARMDataGraphInstructionSetTosa.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyDataGraphTOSAPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyDataGraphTOSAPropertiesARM set(
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
    public VkQueueFamilyDataGraphTOSAPropertiesARM set(VkQueueFamilyDataGraphTOSAPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM malloc() {
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM calloc() {
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance for the specified memory address. */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM create(long address) {
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyDataGraphTOSAPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyDataGraphTOSAPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM malloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM calloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphTOSAPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #profileCount}. */
    public static int nprofileCount(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.PROFILECOUNT); }
    /** Unsafe version of {@link #pProfiles}. */
    public static VkDataGraphTOSANameQualityARM.Buffer npProfiles(long struct) { return VkDataGraphTOSANameQualityARM.create(memGetAddress(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.PPROFILES), nprofileCount(struct)); }
    /** Unsafe version of {@link #extensionCount}. */
    public static int nextensionCount(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.EXTENSIONCOUNT); }
    /** Unsafe version of {@link #pExtensions}. */
    public static VkDataGraphTOSANameQualityARM.Buffer npExtensions(long struct) { return VkDataGraphTOSANameQualityARM.create(memGetAddress(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.PEXTENSIONS), nextensionCount(struct)); }
    /** Unsafe version of {@link #level}. */
    public static int nlevel(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.LEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyDataGraphTOSAPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyDataGraphTOSAPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyDataGraphTOSAPropertiesARM, Buffer> implements NativeResource {

        private static final VkQueueFamilyDataGraphTOSAPropertiesARM ELEMENT_FACTORY = VkQueueFamilyDataGraphTOSAPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyDataGraphTOSAPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyDataGraphTOSAPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyDataGraphTOSAPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyDataGraphTOSAPropertiesARM.npNext(address()); }
        /** @return the value of the {@code profileCount} field. */
        @NativeType("uint32_t")
        public int profileCount() { return VkQueueFamilyDataGraphTOSAPropertiesARM.nprofileCount(address()); }
        /** @return a {@link VkDataGraphTOSANameQualityARM.Buffer} view of the struct array pointed to by the {@code pProfiles} field. */
        @NativeType("VkDataGraphTOSANameQualityARM const *")
        public VkDataGraphTOSANameQualityARM.Buffer pProfiles() { return VkQueueFamilyDataGraphTOSAPropertiesARM.npProfiles(address()); }
        /** @return the value of the {@code extensionCount} field. */
        @NativeType("uint32_t")
        public int extensionCount() { return VkQueueFamilyDataGraphTOSAPropertiesARM.nextensionCount(address()); }
        /** @return a {@link VkDataGraphTOSANameQualityARM.Buffer} view of the struct array pointed to by the {@code pExtensions} field. */
        @NativeType("VkDataGraphTOSANameQualityARM const *")
        public VkDataGraphTOSANameQualityARM.Buffer pExtensions() { return VkQueueFamilyDataGraphTOSAPropertiesARM.npExtensions(address()); }
        /** @return the value of the {@code level} field. */
        @NativeType("VkDataGraphTOSALevelARM")
        public int level() { return VkQueueFamilyDataGraphTOSAPropertiesARM.nlevel(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyDataGraphTOSAPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraphInstructionSetTosa#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer sType$Default() { return sType(ARMDataGraphInstructionSetTosa.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyDataGraphTOSAPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyDataGraphTOSAPropertiesARM.npNext(address(), value); return this; }

    }

}
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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkDescriptorUpdateTemplateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorUpdateTemplateCreateFlags flags;
 *     uint32_t descriptorUpdateEntryCount;
 *     {@link VkDescriptorUpdateTemplateEntry VkDescriptorUpdateTemplateEntry} const * pDescriptorUpdateEntries;
 *     VkDescriptorUpdateTemplateType templateType;
 *     VkDescriptorSetLayout descriptorSetLayout;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipelineLayout pipelineLayout;
 *     uint32_t set;
 * }</code></pre>
 */
public class VkDescriptorUpdateTemplateCreateInfo extends Struct<VkDescriptorUpdateTemplateCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DESCRIPTORUPDATEENTRYCOUNT,
        PDESCRIPTORUPDATEENTRIES,
        TEMPLATETYPE,
        DESCRIPTORSETLAYOUT,
        PIPELINEBINDPOINT,
        PIPELINELAYOUT,
        SET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DESCRIPTORUPDATEENTRYCOUNT = layout.offsetof(3);
        PDESCRIPTORUPDATEENTRIES = layout.offsetof(4);
        TEMPLATETYPE = layout.offsetof(5);
        DESCRIPTORSETLAYOUT = layout.offsetof(6);
        PIPELINEBINDPOINT = layout.offsetof(7);
        PIPELINELAYOUT = layout.offsetof(8);
        SET = layout.offsetof(9);
    }

    protected VkDescriptorUpdateTemplateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDescriptorUpdateTemplateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkDescriptorUpdateTemplateCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkDescriptorUpdateTemplateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorUpdateTemplateCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDescriptorUpdateTemplateCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code descriptorUpdateEntryCount} field. */
    @NativeType("uint32_t")
    public int descriptorUpdateEntryCount() { return ndescriptorUpdateEntryCount(address()); }
    /** @return a {@link VkDescriptorUpdateTemplateEntry.Buffer} view of the struct array pointed to by the {@code pDescriptorUpdateEntries} field. */
    @NativeType("VkDescriptorUpdateTemplateEntry const *")
    public VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries() { return npDescriptorUpdateEntries(address()); }
    /** @return the value of the {@code templateType} field. */
    @NativeType("VkDescriptorUpdateTemplateType")
    public int templateType() { return ntemplateType(address()); }
    /** @return the value of the {@code descriptorSetLayout} field. */
    @NativeType("VkDescriptorSetLayout")
    public long descriptorSetLayout() { return ndescriptorSetLayout(address()); }
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** @return the value of the {@code pipelineLayout} field. */
    @NativeType("VkPipelineLayout")
    public long pipelineLayout() { return npipelineLayout(address()); }
    /** @return the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorUpdateTemplateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO} value to the {@code sType} field. */
    public VkDescriptorUpdateTemplateCreateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorUpdateTemplateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDescriptorUpdateTemplateCreateInfo flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorUpdateTemplateEntry.Buffer} to the {@code pDescriptorUpdateEntries} field. */
    public VkDescriptorUpdateTemplateCreateInfo pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) { npDescriptorUpdateEntries(address(), value); return this; }
    /** Sets the specified value to the {@code templateType} field. */
    public VkDescriptorUpdateTemplateCreateInfo templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) { ntemplateType(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorSetLayout} field. */
    public VkDescriptorUpdateTemplateCreateInfo descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { ndescriptorSetLayout(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkDescriptorUpdateTemplateCreateInfo pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineLayout} field. */
    public VkDescriptorUpdateTemplateCreateInfo pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    public VkDescriptorUpdateTemplateCreateInfo set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorUpdateTemplateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries,
        int templateType,
        long descriptorSetLayout,
        int pipelineBindPoint,
        long pipelineLayout,
        int set
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescriptorUpdateEntries(pDescriptorUpdateEntries);
        templateType(templateType);
        descriptorSetLayout(descriptorSetLayout);
        pipelineBindPoint(pipelineBindPoint);
        pipelineLayout(pipelineLayout);
        set(set);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorUpdateTemplateCreateInfo set(VkDescriptorUpdateTemplateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDescriptorUpdateTemplateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateCreateInfo malloc() {
        return new VkDescriptorUpdateTemplateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateCreateInfo calloc() {
        return new VkDescriptorUpdateTemplateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorUpdateTemplateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkDescriptorUpdateTemplateCreateInfo} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateCreateInfo create(long address) {
        return new VkDescriptorUpdateTemplateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDescriptorUpdateTemplateCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkDescriptorUpdateTemplateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDescriptorUpdateTemplateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDescriptorUpdateTemplateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDescriptorUpdateTemplateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDescriptorUpdateTemplateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorUpdateTemplateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #descriptorUpdateEntryCount}. */
    public static int ndescriptorUpdateEntryCount(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT); }
    /** Unsafe version of {@link #pDescriptorUpdateEntries}. */
    public static VkDescriptorUpdateTemplateEntry.Buffer npDescriptorUpdateEntries(long struct) { return VkDescriptorUpdateTemplateEntry.create(memGetAddress(struct + VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES), ndescriptorUpdateEntryCount(struct)); }
    /** Unsafe version of {@link #templateType}. */
    public static int ntemplateType(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE); }
    /** Unsafe version of {@link #descriptorSetLayout}. */
    public static long ndescriptorSetLayout(long struct) { return memGetLong(struct + VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipelineLayout}. */
    public static long npipelineLayout(long struct) { return memGetLong(struct + VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfo.SET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorUpdateTemplateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code descriptorUpdateEntryCount} field of the specified {@code struct}. */
    public static void ndescriptorUpdateEntryCount(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORUPDATEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntry.Buffer) pDescriptorUpdateEntries}. */
    public static void npDescriptorUpdateEntries(long struct, VkDescriptorUpdateTemplateEntry.Buffer value) { memPutAddress(struct + VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES, value.address()); ndescriptorUpdateEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #templateType(int) templateType}. */
    public static void ntemplateType(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfo.TEMPLATETYPE, value); }
    /** Unsafe version of {@link #descriptorSetLayout(long) descriptorSetLayout}. */
    public static void ndescriptorSetLayout(long struct, long value) { memPutLong(struct + VkDescriptorUpdateTemplateCreateInfo.DESCRIPTORSETLAYOUT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfo.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
    public static void npipelineLayout(long struct, long value) { memPutLong(struct + VkDescriptorUpdateTemplateCreateInfo.PIPELINELAYOUT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfo.SET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDescriptorUpdateTemplateCreateInfo.PDESCRIPTORUPDATEENTRIES));
    }

    // -----------------------------------

    /** An array of {@link VkDescriptorUpdateTemplateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorUpdateTemplateCreateInfo, Buffer> implements NativeResource {

        private static final VkDescriptorUpdateTemplateCreateInfo ELEMENT_FACTORY = VkDescriptorUpdateTemplateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDescriptorUpdateTemplateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDescriptorUpdateTemplateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorUpdateTemplateCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorUpdateTemplateCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDescriptorUpdateTemplateCreateFlags")
        public int flags() { return VkDescriptorUpdateTemplateCreateInfo.nflags(address()); }
        /** @return the value of the {@code descriptorUpdateEntryCount} field. */
        @NativeType("uint32_t")
        public int descriptorUpdateEntryCount() { return VkDescriptorUpdateTemplateCreateInfo.ndescriptorUpdateEntryCount(address()); }
        /** @return a {@link VkDescriptorUpdateTemplateEntry.Buffer} view of the struct array pointed to by the {@code pDescriptorUpdateEntries} field. */
        @NativeType("VkDescriptorUpdateTemplateEntry const *")
        public VkDescriptorUpdateTemplateEntry.Buffer pDescriptorUpdateEntries() { return VkDescriptorUpdateTemplateCreateInfo.npDescriptorUpdateEntries(address()); }
        /** @return the value of the {@code templateType} field. */
        @NativeType("VkDescriptorUpdateTemplateType")
        public int templateType() { return VkDescriptorUpdateTemplateCreateInfo.ntemplateType(address()); }
        /** @return the value of the {@code descriptorSetLayout} field. */
        @NativeType("VkDescriptorSetLayout")
        public long descriptorSetLayout() { return VkDescriptorUpdateTemplateCreateInfo.ndescriptorSetLayout(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkDescriptorUpdateTemplateCreateInfo.npipelineBindPoint(address()); }
        /** @return the value of the {@code pipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pipelineLayout() { return VkDescriptorUpdateTemplateCreateInfo.npipelineLayout(address()); }
        /** @return the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return VkDescriptorUpdateTemplateCreateInfo.nset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorUpdateTemplateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO} value to the {@code sType} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorUpdateTemplateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer flags(@NativeType("VkDescriptorUpdateTemplateCreateFlags") int value) { VkDescriptorUpdateTemplateCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorUpdateTemplateEntry.Buffer} to the {@code pDescriptorUpdateEntries} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer pDescriptorUpdateEntries(@NativeType("VkDescriptorUpdateTemplateEntry const *") VkDescriptorUpdateTemplateEntry.Buffer value) { VkDescriptorUpdateTemplateCreateInfo.npDescriptorUpdateEntries(address(), value); return this; }
        /** Sets the specified value to the {@code templateType} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer templateType(@NativeType("VkDescriptorUpdateTemplateType") int value) { VkDescriptorUpdateTemplateCreateInfo.ntemplateType(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorSetLayout} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { VkDescriptorUpdateTemplateCreateInfo.ndescriptorSetLayout(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkDescriptorUpdateTemplateCreateInfo.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineLayout} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkDescriptorUpdateTemplateCreateInfo.npipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        public VkDescriptorUpdateTemplateCreateInfo.Buffer set(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfo.nset(address(), value); return this; }

    }

}
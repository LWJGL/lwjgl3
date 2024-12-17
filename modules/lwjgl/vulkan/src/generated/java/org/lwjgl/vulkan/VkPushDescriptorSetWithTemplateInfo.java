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
 * <pre>{@code
 * struct VkPushDescriptorSetWithTemplateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDescriptorUpdateTemplate descriptorUpdateTemplate;
 *     VkPipelineLayout layout;
 *     uint32_t set;
 *     void const * pData;
 * }}</pre>
 */
public class VkPushDescriptorSetWithTemplateInfo extends Struct<VkPushDescriptorSetWithTemplateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORUPDATETEMPLATE,
        LAYOUT,
        SET,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORUPDATETEMPLATE = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        SET = layout.offsetof(4);
        PDATA = layout.offsetof(5);
    }

    protected VkPushDescriptorSetWithTemplateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushDescriptorSetWithTemplateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPushDescriptorSetWithTemplateInfo(address, container);
    }

    /**
     * Creates a {@code VkPushDescriptorSetWithTemplateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushDescriptorSetWithTemplateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code descriptorUpdateTemplate} field. */
    @NativeType("VkDescriptorUpdateTemplate")
    public long descriptorUpdateTemplate() { return ndescriptorUpdateTemplate(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }
    /** @return the value of the {@code pData} field. */
    @NativeType("void const *")
    public long pData() { return npData(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPushDescriptorSetWithTemplateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO} value to the {@code sType} field. */
    public VkPushDescriptorSetWithTemplateInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPushDescriptorSetWithTemplateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkPushDescriptorSetWithTemplateInfo pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code descriptorUpdateTemplate} field. */
    public VkPushDescriptorSetWithTemplateInfo descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) { ndescriptorUpdateTemplate(address(), value); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkPushDescriptorSetWithTemplateInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    public VkPushDescriptorSetWithTemplateInfo set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }
    /** Sets the specified value to the {@code pData} field. */
    public VkPushDescriptorSetWithTemplateInfo pData(@NativeType("void const *") long value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushDescriptorSetWithTemplateInfo set(
        int sType,
        long pNext,
        long descriptorUpdateTemplate,
        long layout,
        int set,
        long pData
    ) {
        sType(sType);
        pNext(pNext);
        descriptorUpdateTemplate(descriptorUpdateTemplate);
        layout(layout);
        set(set);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushDescriptorSetWithTemplateInfo set(VkPushDescriptorSetWithTemplateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetWithTemplateInfo malloc() {
        return new VkPushDescriptorSetWithTemplateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushDescriptorSetWithTemplateInfo calloc() {
        return new VkPushDescriptorSetWithTemplateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPushDescriptorSetWithTemplateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushDescriptorSetWithTemplateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPushDescriptorSetWithTemplateInfo} instance for the specified memory address. */
    public static VkPushDescriptorSetWithTemplateInfo create(long address) {
        return new VkPushDescriptorSetWithTemplateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushDescriptorSetWithTemplateInfo createSafe(long address) {
        return address == NULL ? null : new VkPushDescriptorSetWithTemplateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushDescriptorSetWithTemplateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushDescriptorSetWithTemplateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetWithTemplateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetWithTemplateInfo malloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushDescriptorSetWithTemplateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushDescriptorSetWithTemplateInfo calloc(MemoryStack stack) {
        return new VkPushDescriptorSetWithTemplateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushDescriptorSetWithTemplateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushDescriptorSetWithTemplateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPushDescriptorSetWithTemplateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPushDescriptorSetWithTemplateInfo.PNEXT); }
    /** Unsafe version of {@link #descriptorUpdateTemplate}. */
    public static long ndescriptorUpdateTemplate(long struct) { return memGetLong(struct + VkPushDescriptorSetWithTemplateInfo.DESCRIPTORUPDATETEMPLATE); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkPushDescriptorSetWithTemplateInfo.LAYOUT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return memGetInt(struct + VkPushDescriptorSetWithTemplateInfo.SET); }
    /** Unsafe version of {@link #pData}. */
    public static long npData(long struct) { return memGetAddress(struct + VkPushDescriptorSetWithTemplateInfo.PDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPushDescriptorSetWithTemplateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPushDescriptorSetWithTemplateInfo.PNEXT, value); }
    /** Unsafe version of {@link #descriptorUpdateTemplate(long) descriptorUpdateTemplate}. */
    public static void ndescriptorUpdateTemplate(long struct, long value) { memPutLong(struct + VkPushDescriptorSetWithTemplateInfo.DESCRIPTORUPDATETEMPLATE, value); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkPushDescriptorSetWithTemplateInfo.LAYOUT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { memPutInt(struct + VkPushDescriptorSetWithTemplateInfo.SET, value); }
    /** Unsafe version of {@link #pData(long) pData}. */
    public static void npData(long struct, long value) { memPutAddress(struct + VkPushDescriptorSetWithTemplateInfo.PDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPushDescriptorSetWithTemplateInfo.PDATA));
    }

    // -----------------------------------

    /** An array of {@link VkPushDescriptorSetWithTemplateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPushDescriptorSetWithTemplateInfo, Buffer> implements NativeResource {

        private static final VkPushDescriptorSetWithTemplateInfo ELEMENT_FACTORY = VkPushDescriptorSetWithTemplateInfo.create(-1L);

        /**
         * Creates a new {@code VkPushDescriptorSetWithTemplateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushDescriptorSetWithTemplateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushDescriptorSetWithTemplateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPushDescriptorSetWithTemplateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPushDescriptorSetWithTemplateInfo.npNext(address()); }
        /** @return the value of the {@code descriptorUpdateTemplate} field. */
        @NativeType("VkDescriptorUpdateTemplate")
        public long descriptorUpdateTemplate() { return VkPushDescriptorSetWithTemplateInfo.ndescriptorUpdateTemplate(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkPushDescriptorSetWithTemplateInfo.nlayout(address()); }
        /** @return the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return VkPushDescriptorSetWithTemplateInfo.nset(address()); }
        /** @return the value of the {@code pData} field. */
        @NativeType("void const *")
        public long pData() { return VkPushDescriptorSetWithTemplateInfo.npData(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPushDescriptorSetWithTemplateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO} value to the {@code sType} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPushDescriptorSetWithTemplateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code descriptorUpdateTemplate} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer descriptorUpdateTemplate(@NativeType("VkDescriptorUpdateTemplate") long value) { VkPushDescriptorSetWithTemplateInfo.ndescriptorUpdateTemplate(address(), value); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkPushDescriptorSetWithTemplateInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer set(@NativeType("uint32_t") int value) { VkPushDescriptorSetWithTemplateInfo.nset(address(), value); return this; }
        /** Sets the specified value to the {@code pData} field. */
        public VkPushDescriptorSetWithTemplateInfo.Buffer pData(@NativeType("void const *") long value) { VkPushDescriptorSetWithTemplateInfo.npData(address(), value); return this; }

    }

}
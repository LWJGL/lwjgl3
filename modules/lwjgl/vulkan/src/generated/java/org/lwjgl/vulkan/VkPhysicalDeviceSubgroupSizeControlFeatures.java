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
 * Structure describing the subgroup size control features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSubgroupSizeControlFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceSubgroupSizeControlFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure was added in version 2 of the {@link EXTSubgroupSizeControl VK_EXT_subgroup_size_control} extension. Version 1 implementations of this extension will not fill out the features structure but applications may assume that both {@code subgroupSizeControl} and {@code computeFullSubgroups} are supported if the extension is supported. (See also the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-requirements">Feature Requirements</a> section.) Applications are advised to add a {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure to the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features regardless of the version of the extension supported by the implementation. If the implementation only supports version 1, it will safely ignore the {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure.</p>
 * 
 * <p>Vulkan 1.3 implementations always support the features structure.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupSizeControlFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #subgroupSizeControl};
 *     VkBool32 {@link #computeFullSubgroups};
 * }</code></pre>
 */
public class VkPhysicalDeviceSubgroupSizeControlFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBGROUPSIZECONTROL,
        COMPUTEFULLSUBGROUPS;

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
        SUBGROUPSIZECONTROL = layout.offsetof(2);
        COMPUTEFULLSUBGROUPS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupSizeControlFeatures(ByteBuffer container) {
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
    /** indicates whether the implementation supports controlling shader subgroup sizes via the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT} flag and the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} structure. */
    @NativeType("VkBool32")
    public boolean subgroupSizeControl() { return nsubgroupSizeControl(address()) != 0; }
    /** indicates whether the implementation supports requiring full subgroups in compute shaders via the {@link VK13#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT} flag. */
    @NativeType("VkBool32")
    public boolean computeFullSubgroups() { return ncomputeFullSubgroups(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #subgroupSizeControl} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures subgroupSizeControl(@NativeType("VkBool32") boolean value) { nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #computeFullSubgroups} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures computeFullSubgroups(@NativeType("VkBool32") boolean value) { ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubgroupSizeControlFeatures set(
        int sType,
        long pNext,
        boolean subgroupSizeControl,
        boolean computeFullSubgroups
    ) {
        sType(sType);
        pNext(pNext);
        subgroupSizeControl(subgroupSizeControl);
        computeFullSubgroups(computeFullSubgroups);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubgroupSizeControlFeatures set(VkPhysicalDeviceSubgroupSizeControlFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures malloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures calloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures create(long address) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.PNEXT); }
    /** Unsafe version of {@link #subgroupSizeControl}. */
    public static int nsubgroupSizeControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeatures.SUBGROUPSIZECONTROL); }
    /** Unsafe version of {@link #computeFullSubgroups}. */
    public static int ncomputeFullSubgroups(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeatures.COMPUTEFULLSUBGROUPS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubgroupSizeControlFeatures.PNEXT, value); }
    /** Unsafe version of {@link #subgroupSizeControl(boolean) subgroupSizeControl}. */
    public static void nsubgroupSizeControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeatures.SUBGROUPSIZECONTROL, value); }
    /** Unsafe version of {@link #computeFullSubgroups(boolean) computeFullSubgroups}. */
    public static void ncomputeFullSubgroups(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeatures.COMPUTEFULLSUBGROUPS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupSizeControlFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupSizeControlFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubgroupSizeControlFeatures ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupSizeControlFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubgroupSizeControlFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupSizeControlFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupSizeControlFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#subgroupSizeControl} field. */
        @NativeType("VkBool32")
        public boolean subgroupSizeControl() { return VkPhysicalDeviceSubgroupSizeControlFeatures.nsubgroupSizeControl(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#computeFullSubgroups} field. */
        @NativeType("VkBool32")
        public boolean computeFullSubgroups() { return VkPhysicalDeviceSubgroupSizeControlFeatures.ncomputeFullSubgroups(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES} value to the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#pNext} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupSizeControlFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#subgroupSizeControl} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeatures.nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupSizeControlFeatures#computeFullSubgroups} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeatures.Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeatures.ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    }

}
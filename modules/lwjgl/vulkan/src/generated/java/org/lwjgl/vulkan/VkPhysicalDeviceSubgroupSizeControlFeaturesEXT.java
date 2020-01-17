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
 * <p>If the {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether the feature is supported. {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the feature.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure was added in version 2 of the {@link EXTSubgroupSizeControl VK_EXT_subgroup_size_control} extension. Version 1 implementations of this extension will not fill out the features structure but applications may assume that both {@code subgroupSizeControl} and {@code computeFullSubgroups} are supported if the extension is supported. (See also the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-requirements">Feature Requirements</a> section.) Applications are advised to add a {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure to the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features regardless of the version of the extension supported by the implementation. If the implementation only supports version 1, it will safely ignore the {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structure.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubgroupSizeControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code subgroupSizeControl} &ndash; indicates whether the implementation supports controlling shader subgroup sizes via the {@link EXTSubgroupSizeControl#VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT} flag and the {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} structure.</li>
 * <li>{@code computeFullSubgroups} &ndash; indicates whether the implementation supports requiring full subgroups in compute shaders via the {@link EXTSubgroupSizeControl#VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT} flag.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupSizeControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 subgroupSizeControl;
 *     VkBool32 computeFullSubgroups;
 * }</code></pre>
 */
public class VkPhysicalDeviceSubgroupSizeControlFeaturesEXT extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code subgroupSizeControl} field. */
    @NativeType("VkBool32")
    public boolean subgroupSizeControl() { return nsubgroupSizeControl(address()) != 0; }
    /** Returns the value of the {@code computeFullSubgroups} field. */
    @NativeType("VkBool32")
    public boolean computeFullSubgroups() { return ncomputeFullSubgroups(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code subgroupSizeControl} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT subgroupSizeControl(@NativeType("VkBool32") boolean value) { nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code computeFullSubgroups} field. */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT computeFullSubgroups(@NativeType("VkBool32") boolean value) { ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT set(
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
    public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT set(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #subgroupSizeControl}. */
    public static int nsubgroupSizeControl(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.SUBGROUPSIZECONTROL); }
    /** Unsafe version of {@link #computeFullSubgroups}. */
    public static int ncomputeFullSubgroups(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.COMPUTEFULLSUBGROUPS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #subgroupSizeControl(boolean) subgroupSizeControl}. */
    public static void nsubgroupSizeControl(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.SUBGROUPSIZECONTROL, value); }
    /** Unsafe version of {@link #computeFullSubgroups(boolean) computeFullSubgroups}. */
    public static void ncomputeFullSubgroups(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.COMPUTEFULLSUBGROUPS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupSizeControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubgroupSizeControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupSizeControlFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubgroupSizeControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.npNext(address()); }
        /** Returns the value of the {@code subgroupSizeControl} field. */
        @NativeType("VkBool32")
        public boolean subgroupSizeControl() { return VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsubgroupSizeControl(address()) != 0; }
        /** Returns the value of the {@code computeFullSubgroups} field. */
        @NativeType("VkBool32")
        public boolean computeFullSubgroups() { return VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.ncomputeFullSubgroups(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code subgroupSizeControl} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer subgroupSizeControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.nsubgroupSizeControl(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code computeFullSubgroups} field. */
        public VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.Buffer computeFullSubgroups(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceSubgroupSizeControlFeaturesEXT.ncomputeFullSubgroups(address(), value ? 1 : 0); return this; }

    }

}
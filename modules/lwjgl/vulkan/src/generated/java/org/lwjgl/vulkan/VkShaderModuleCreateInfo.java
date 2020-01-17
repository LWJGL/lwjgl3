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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created shader module.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code codeSize} <b>must</b> be greater than 0</li>
 * <li>If {@code pCode} is a pointer to SPIR-V code, {@code codeSize} <b>must</b> be a multiple of 4</li>
 * <li>{@code pCode} <b>must</b> point to either valid SPIR-V code, formatted and packed as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirv-spec">Khronos SPIR-V Specification</a> or valid GLSL code which <b>must</b> be written to the {@code GL_KHR_vulkan_glsl} extension specification</li>
 * <li>If {@code pCode} is a pointer to SPIR-V code, that code <b>must</b> adhere to the validation rules described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-module-validation">Validation Rules within a Module</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code pCode} is a pointer to GLSL code, it <b>must</b> be valid GLSL code written to the {@code GL_KHR_vulkan_glsl} GLSL extension specification</li>
 * <li>{@code pCode} <b>must</b> declare the {@code Shader} capability for SPIR-V code</li>
 * <li>{@code pCode} <b>must</b> not declare any capability that is not supported by the API, as described by the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-module-validation">Capabilities</a> section of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-capabilities">SPIR-V Environment</a> appendix</li>
 * <li>If {@code pCode} declares any of the capabilities listed as optional: in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#spirvenv-capabilities-table">SPIR-V Environment</a> appendix, the corresponding feature(s) <b>must</b> be enabled.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkShaderModuleValidationCacheCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pCode} <b>must</b> be a valid pointer to an array of {@code codeSize / 4} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateShaderModule CreateShaderModule}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code codeSize} &ndash; the size, in bytes, of the code pointed to by {@code pCode}.</li>
 * <li>{@code pCode} &ndash; points to code that is used to create the shader module</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShaderModuleCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderModuleCreateFlags flags;
 *     size_t codeSize;
 *     uint32_t const * pCode;
 * }</code></pre>
 */
public class VkShaderModuleCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        CODESIZE,
        PCODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CODESIZE = layout.offsetof(3);
        PCODE = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkShaderModuleCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderModuleCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkShaderModuleCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code codeSize} field. */
    @NativeType("size_t")
    public long codeSize() { return ncodeSize(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
    @NativeType("uint32_t const *")
    public ByteBuffer pCode() { return npCode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkShaderModuleCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkShaderModuleCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkShaderModuleCreateInfo flags(@NativeType("VkShaderModuleCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
    public VkShaderModuleCreateInfo pCode(@NativeType("uint32_t const *") ByteBuffer value) { npCode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderModuleCreateInfo set(
        int sType,
        long pNext,
        int flags,
        ByteBuffer pCode
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pCode(pCode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShaderModuleCreateInfo set(VkShaderModuleCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderModuleCreateInfo malloc() {
        return wrap(VkShaderModuleCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderModuleCreateInfo calloc() {
        return wrap(VkShaderModuleCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkShaderModuleCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkShaderModuleCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance for the specified memory address. */
    public static VkShaderModuleCreateInfo create(long address) {
        return wrap(VkShaderModuleCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderModuleCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkShaderModuleCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkShaderModuleCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkShaderModuleCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkShaderModuleCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkShaderModuleCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkShaderModuleCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkShaderModuleCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderModuleCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkShaderModuleCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderModuleCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderModuleCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkShaderModuleCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkShaderModuleCreateInfo.FLAGS); }
    /** Unsafe version of {@link #codeSize}. */
    public static long ncodeSize(long struct) { return memGetAddress(struct + VkShaderModuleCreateInfo.CODESIZE); }
    /** Unsafe version of {@link #pCode() pCode}. */
    public static ByteBuffer npCode(long struct) { return memByteBuffer(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE), (int)ncodeSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderModuleCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkShaderModuleCreateInfo.FLAGS, value); }
    /** Sets the specified value to the {@code codeSize} field of the specified {@code struct}. */
    public static void ncodeSize(long struct, long value) { memPutAddress(struct + VkShaderModuleCreateInfo.CODESIZE, value); }
    /** Unsafe version of {@link #pCode(ByteBuffer) pCode}. */
    public static void npCode(long struct, ByteBuffer value) { memPutAddress(struct + VkShaderModuleCreateInfo.PCODE, memAddress(value)); ncodeSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShaderModuleCreateInfo.PCODE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkShaderModuleCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkShaderModuleCreateInfo, Buffer> implements NativeResource {

        private static final VkShaderModuleCreateInfo ELEMENT_FACTORY = VkShaderModuleCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkShaderModuleCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderModuleCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkShaderModuleCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderModuleCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkShaderModuleCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkShaderModuleCreateFlags")
        public int flags() { return VkShaderModuleCreateInfo.nflags(address()); }
        /** Returns the value of the {@code codeSize} field. */
        @NativeType("size_t")
        public long codeSize() { return VkShaderModuleCreateInfo.ncodeSize(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
        @NativeType("uint32_t const *")
        public ByteBuffer pCode() { return VkShaderModuleCreateInfo.npCode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkShaderModuleCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderModuleCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkShaderModuleCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkShaderModuleCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkShaderModuleCreateInfo.Buffer flags(@NativeType("VkShaderModuleCreateFlags") int value) { VkShaderModuleCreateInfo.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
        public VkShaderModuleCreateInfo.Buffer pCode(@NativeType("uint32_t const *") ByteBuffer value) { VkShaderModuleCreateInfo.npCode(address(), value); return this; }

    }

}
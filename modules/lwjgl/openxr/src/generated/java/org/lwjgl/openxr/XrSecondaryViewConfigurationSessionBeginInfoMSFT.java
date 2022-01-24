/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes an extension structure to {@link XR10#xrBeginSession BeginSession} indicating supported view configuration types.
 * 
 * <h5>Description</h5>
 * 
 * <p>If there are any duplicated view configuration types in the array of {@code enabledViewConfigurationTypes}, the runtime <b>must</b> return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>If there are any primary view configuration types in the array of {@code enabledViewConfigurationTypes}, the runtime <b>must</b> return error {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>If there are any secondary view configuration types not returned by {@link XR10#xrEnumerateViewConfigurations EnumerateViewConfigurations} in the array of {@code enabledViewConfigurationTypes}, the runtime <b>must</b> return error {@link XR10#XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code enabledViewConfigurationTypes} <b>must</b> be a pointer to an array of {@code viewConfigurationCount} valid {@code XrViewConfigurationType} values</li>
 * <li>The {@code viewConfigurationCount} parameter <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSessionBeginInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSecondaryViewConfigurationSessionBeginInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #viewConfigurationCount};
 *     XrViewConfigurationType const * {@link #enabledViewConfigurationTypes};
 * }</code></pre>
 */
public class XrSecondaryViewConfigurationSessionBeginInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONCOUNT,
        ENABLEDVIEWCONFIGURATIONTYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONCOUNT = layout.offsetof(2);
        ENABLEDVIEWCONFIGURATIONTYPES = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of elements in {@code enabledViewConfigurationTypes} */
    @NativeType("uint32_t")
    public int viewConfigurationCount() { return nviewConfigurationCount(address()); }
    /** an array of enabled secondary view configuration types that application supports. */
    @NativeType("XrViewConfigurationType const *")
    public IntBuffer enabledViewConfigurationTypes() { return nenabledViewConfigurationTypes(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT} value to the {@link #type} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #enabledViewConfigurationTypes} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT enabledViewConfigurationTypes(@NativeType("XrViewConfigurationType const *") IntBuffer value) { nenabledViewConfigurationTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT set(
        int type,
        long next,
        IntBuffer enabledViewConfigurationTypes
    ) {
        type(type);
        next(next);
        enabledViewConfigurationTypes(enabledViewConfigurationTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT set(XrSecondaryViewConfigurationSessionBeginInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT malloc() {
        return wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT calloc() {
        return wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT create(long address) {
        return wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationSessionBeginInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationCount}. */
    public static int nviewConfigurationCount(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.VIEWCONFIGURATIONCOUNT); }
    /** Unsafe version of {@link #enabledViewConfigurationTypes() enabledViewConfigurationTypes}. */
    public static IntBuffer nenabledViewConfigurationTypes(long struct) { return memIntBuffer(memGetAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.ENABLEDVIEWCONFIGURATIONTYPES), nviewConfigurationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.NEXT, value); }
    /** Sets the specified value to the {@code viewConfigurationCount} field of the specified {@code struct}. */
    public static void nviewConfigurationCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.VIEWCONFIGURATIONCOUNT, value); }
    /** Unsafe version of {@link #enabledViewConfigurationTypes(IntBuffer) enabledViewConfigurationTypes}. */
    public static void nenabledViewConfigurationTypes(long struct, IntBuffer value) { memPutAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.ENABLEDVIEWCONFIGURATIONTYPES, memAddress(value)); nviewConfigurationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.ENABLEDVIEWCONFIGURATIONTYPES));
    }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationSessionBeginInfoMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationSessionBeginInfoMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationSessionBeginInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSecondaryViewConfigurationSessionBeginInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#viewConfigurationCount} field. */
        @NativeType("uint32_t")
        public int viewConfigurationCount() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.nviewConfigurationCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#enabledViewConfigurationTypes} field. */
        @NativeType("XrViewConfigurationType const *")
        public IntBuffer enabledViewConfigurationTypes() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.nenabledViewConfigurationTypes(address()); }

        /** Sets the specified value to the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#type} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationSessionBeginInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT} value to the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#type} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#next} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSecondaryViewConfigurationSessionBeginInfoMSFT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#enabledViewConfigurationTypes} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer enabledViewConfigurationTypes(@NativeType("XrViewConfigurationType const *") IntBuffer value) { XrSecondaryViewConfigurationSessionBeginInfoMSFT.nenabledViewConfigurationTypes(address(), value); return this; }

    }

}
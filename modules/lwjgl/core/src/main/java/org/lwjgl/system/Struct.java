/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Base class of all struct implementations. */
public abstract class Struct<SELF extends Struct<SELF>> extends Pointer.Default {

    protected static final int DEFAULT_PACK_ALIGNMENT = Platform.get() == Platform.WINDOWS ? 8 : 0x4000_0000;
    protected static final int DEFAULT_ALIGN_AS       = 0;

    static {
        Library.initialize();
    }

    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    @Nullable
    protected ByteBuffer container;

    /**
     * Creates a struct instance at the specified address.
     *
     * @param address   the struct memory address
     * @param container an optional container buffer, to be referenced strongly by the struct instance.
     */
    protected Struct(long address, @Nullable ByteBuffer container) {
        super(address);
        this.container = container;
    }

    /**
     * Similar to {@link #Struct(long, ByteBuffer) the constructor}, but returns the exact type of the {@code Struct} subclass.
     *
     * <p>Effectively, every {@code Struct} instance is a factory for more instances of the same type. This is used by {@link StructBuffer}.</p>
     *
     * @param address   the struct memory address
     * @param container an optional container buffer, to be referenced strongly by the struct instance.
     */
    protected abstract SELF create(long address, @Nullable ByteBuffer container);

    /** Returns {@code sizeof(struct)}. */
    public abstract int sizeof();

    /** Zeroes-out the struct data. */
    public void clear() {
        memSet(address(), 0, sizeof());
    }

    /**
     * Frees the struct allocation.
     *
     * <p>This method should not be used if the memory backing this struct is not owned by the struct.</p>
     */
    public void free() {
        nmemFree(address());
    }

    /**
     * Returns true if the pointer member that corresponds to the specified {@code memberOffset} is {@code NULL}.
     *
     * <p>This is useful to verify that not nullable members of an untrusted struct instance are indeed not {@code NULL}.</p>
     *
     * @param memberOffset the byte offset of the member to query
     *
     * @return true if the member is {@code NULL}
     */
    public boolean isNull(int memberOffset) {
        if (DEBUG) {
            checkMemberOffset(memberOffset);
        }
        return memGetAddress(address() + memberOffset) == NULL;
    }

    // ---------------- Implementation utilities ----------------

    private void checkMemberOffset(int memberOffset) {
        if (memberOffset < 0 || sizeof() - memberOffset < POINTER_SIZE) {
            throw new IllegalArgumentException("Invalid member offset.");
        }
    }

    protected static ByteBuffer __checkContainer(ByteBuffer container, int sizeof) {
        if (CHECKS) {
            check(container, sizeof);
        }
        return container;
    }

    private static long getBytes(int elements, int elementSize) {
        return (elements & 0xFFFF_FFFFL) * elementSize;
    }

    protected static long __checkMalloc(int elements, int elementSize) {
        long bytes = (elements & 0xFFFF_FFFFL) * elementSize;
        if (DEBUG) {
            if (elements < 0) {
                throw new IllegalArgumentException("Invalid number of elements");
            }
            if (BITS32 && 0xFFFF_FFFFL < bytes) {
                throw new IllegalArgumentException("The request allocation is too large");
            }
        }
        return bytes;
    }

    protected static ByteBuffer __create(int elements, int elementSize) {
        apiCheckAllocation(elements, getBytes(elements, elementSize), 0x7FFF_FFFFL);
        return ByteBuffer.allocateDirect(elements * elementSize).order(ByteOrder.nativeOrder());
    }

    @Nullable
    protected static <T extends Struct<T>> ByteBuffer __getContainer(T struct) {
        return struct.container;
    }

    @Nullable
    protected static ByteBuffer __getContainer(StructBuffer<?, ?> struct) {
        return struct.container;
    }


    /** A functional interface that enables lambda expressions to be passed to the {@link #validate} method. [INTERNAL USE ONLY] */
    @FunctionalInterface
    public interface StructValidation {
        void validate(long struct);
    }

    /**
     * Validates each struct contained in the specified struct array. [INTERNAL USE ONLY]
     *
     * @param array  the struct array to validate
     * @param count  the number of structs in {@code array}
     * @param SIZEOF the size of each struct, in bytes
     */
    public static void validate(long array, int count, int SIZEOF, StructValidation validation) {
        for (int i = 0; i < count; i++) {
            validation.validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // ---------------- Struct Member Layout ----------------

    protected static class Member {
        final int     size;
        final int     alignment;
        final boolean forcedAlignment;

        int offset;

        Member(int size, int alignment, boolean forcedAlignment) {
            this.size = size;
            this.alignment = alignment;
            this.forcedAlignment = forcedAlignment;
        }

        public int getSize() {
            return size;
        }

        public int getAlignment() {
            return alignment;
        }

        public int getAlignment(int packAlignment) {
            return forcedAlignment ? alignment : min(alignment, packAlignment);
        }
    }

    protected static class Layout extends Member {
        final Member[] members;

        Layout(int size, int alignment, boolean forceAlignment, Member[] members) {
            super(size, alignment, forceAlignment);
            this.members = members;
        }

        public int offsetof(int member) {
            return members[member].offset;
        }
    }

    protected static Member __padding(int num, boolean condition) {
        return __padding(num, 1, condition);
    }

    protected static Member __padding(int num, int size, boolean condition) {
        return __member(condition ? num * size : 0, size);
    }

    protected static Member __member(int size) {
        return __member(size, size);
    }

    protected static Member __member(int size, int alignment) {
        return __member(size, alignment, false);
    }

    protected static Member __member(int size, int alignment, boolean forceAlignment) {
        return new Member(size, alignment, forceAlignment);
    }

    protected static Member __array(int size, int length) {
        return __array(size, size, length);
    }
    protected static Member __array(int size, int alignment, int length) {
        return new Member(size * length, alignment, false);
    }
    protected static Member __array(int size, int alignment, boolean forceAlignment, int length) {
        return new Member(size * length, alignment, forceAlignment);
    }

    protected static Layout __union(Member... members) { return __union(DEFAULT_PACK_ALIGNMENT, DEFAULT_ALIGN_AS, members); }
    protected static Layout __union(int packAlignment, int alignas, Member... members) {
        List<Member> union = new ArrayList<>(members.length);

        int size      = 0;
        int alignment = alignas;
        for (Member m : members) {
            size = max(size, m.size);
            alignment = max(alignment, m.getAlignment(packAlignment));

            m.offset = 0;
            union.add(m);
            if (m instanceof Layout) {
                addNestedMembers(m, union, 0);
            }
        }

        return new Layout(size, alignment, alignas != 0, union.toArray(new Member[0]));
    }

    protected static Layout __struct(Member... members) { return __struct(DEFAULT_PACK_ALIGNMENT, DEFAULT_ALIGN_AS, members); }
    protected static Layout __struct(int packAlignment, int alignas, Member... members) {
        List<Member> struct = new ArrayList<>(members.length);

        int size      = 0;
        int alignment = alignas;
        for (Member m : members) {
            int memberAlignment = m.getAlignment(packAlignment);

            m.offset = align(size, memberAlignment);

            size = m.offset + m.size;
            alignment = max(alignment, memberAlignment);

            struct.add(m);
            if (m instanceof Layout) {
                addNestedMembers(m, struct, m.offset);
            }
        }

        // tail padding
        size = align(size, alignment);

        return new Layout(size, alignment, alignas != 0, struct.toArray(new Member[0]));
    }

    private static void addNestedMembers(Member nested, List<Member> members, int offset) {
        Layout layout = (Layout)nested;

        for (Member m : layout.members) {
            m.offset += offset;
            members.add(m);
        }
    }

    private static int align(int offset, int alignment) {
        return ((offset - 1) | (alignment - 1)) + 1;
    }

}
/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
// This is the implementation of address-aligned malloc and free using a linked list (inserting at front).
// These functions are not thread-safe because there is an access to the addressList global variable.
// Use a mutex when you access the global variable to make it thread-safe.
#include <stdlib.h>
#include <stdio.h>

// a linked list node to store a coupled memory address of the original and aligned address.
typedef struct llnode
{
    void*          original;  // store the original starting address
    void*          aligned;   // store the aligned starting address
    struct llnode* next;
} node;

static node* s_addressList = NULL;
static void PrintList();
template <typename T>
static T GetNextPowerOfTwo(T nValue);

//=================================================================================================================================
/// Takes the size of the buffer you would like  to allocate with the return buffer starts on an alignment boundary (multiple of
///  alignment input specified).  The input alignment should be a power of 2.
///  The memory allocated through aligned_malloc has to be deallocated by aligned_free.  Otherwise the result will be unspecified.
///
/// \param bytes     The number of bytes requested.
/// \param alignment The alignment required for the output address of the memory.  This should be of a power of 2
///                  (i.e. 1, 2, 4, 8, 16, ...).
///
/// \return The starting address of the allocated memory.  The address will be aligned to the specified request.
//=================================================================================================================================
void* aligned_malloc(size_t bytes, size_t alignment)
{
    // sanity checks
    if (bytes <= 0)
    {
        return NULL;
    }

    // if alignment is less than equal to zero, we set it to 1.
    alignment = (alignment <= 0) ? 1 : alignment;

    // make sure alignment is of power of 2.
    if ((alignment & (alignment - 1)) != 0)
    {
        // alignment is not of power of 2, round it to the next power of 2.
        alignment = GetNextPowerOfTwo(alignment);

#if defined(_MSC_VER) && _MSC_VER < 1900
        fprintf (stderr, "aligned_malloc: rounding the alignment to %Iu\n", alignment);
#else
        fprintf (stderr, "aligned_malloc: rounding the alignment to %zu\n", alignment);
#endif
    }

    // request memory larger than the input request size to
    // accomodate alignment size.  In the worst case we waste
    // alignment - 1 bytes.
    size_t totalSize = bytes + alignment - 1;

    void*  memory;

    if ((memory = malloc(totalSize)) == NULL)
    {
        return NULL;
    }

    // Compute the offset alignment to add to the address. Because alignment is guaranteed to be power of 2,
    //  we do not need to use modulus operator.  The second line ensures that if the original address
    //  already address aligned, the offset should be 0.
    size_t offset;
    offset = alignment - ((size_t) memory & (alignment - 1));
    offset = (offset == alignment) ? 0 : offset;

    void* originalAddress = memory;
    memory = (void*)((size_t) memory + offset);

    // Store a coupled entry of address and aligned address into a linked list so we can free the memory with the correct
    //  address in aligned_free() function.  The new coupled entry is prepended into the linked list.  The next code makes sure
    //  that the linked list does not store multiple entry of the same memory address.
    node* addressEntry;

    for (addressEntry = s_addressList;
         addressEntry != NULL;
         addressEntry = addressEntry->next)
    {
        if (addressEntry->aligned == memory)
        {
            fprintf(stderr, "Error: malloc returns duplicate address.\n");
            free(originalAddress);
            return NULL;
        }
    }

    addressEntry           = (node*) malloc(sizeof(node));
    addressEntry->original = originalAddress;
    addressEntry->aligned  = memory;
    addressEntry->next     = s_addressList;
    s_addressList          = addressEntry;

    return memory;
}


//=================================================================================================================================
// Print the linked-list, used for debugging purposes.
//
// \return void
//=================================================================================================================================
void PrintList()
{
    node* addressEntry;

    fprintf(stderr, "List = ");

    for (addressEntry = s_addressList;
         addressEntry != NULL;
         addressEntry = addressEntry->next)
    {
        fprintf(stderr, "(o = %p, a = %p), ",
                addressEntry->original, addressEntry->aligned);
    }

    fprintf(stderr, "\n");
}

//=================================================================================================================================
// Free the allocated memory by aligned_malloc function call.
//
// \param p  the starting address of the memory to be deallocated.
//
// \return void
//=================================================================================================================================
void aligned_free(void* p)
{
    if (p == NULL)
    {
        return;
    }

    node* addressEntry;
    node* prevAddressEntry;

    prevAddressEntry = s_addressList;

    for (addressEntry = s_addressList;
         addressEntry != NULL;
         addressEntry = addressEntry->next)
    {
        if (addressEntry->aligned == p)
        {
            free(addressEntry->original);

            prevAddressEntry->next = addressEntry->next;

            // if we are deleting the head node, update the head node
            if (s_addressList == addressEntry)
            {
                s_addressList = addressEntry->next;
            }

            free(addressEntry);

            return;
        }

        prevAddressEntry = addressEntry;
    }

    fprintf(stderr, "Error: Can't free pointer = %p\n", p);

    return;
}

//=================================================================================================================================
// Round a number up to the next power of two number.  If the number is already a power of 2, it returns the same number.
// This function only works for 32 bits number.
//
// \param nValue  The input value to be rounded up.
//
// \return the next power of two
//=================================================================================================================================
template <typename T>
T GetNextPowerOfTwo(T nValue)
{
    if (nValue < 1)
    {
        return 1;
    }

    nValue--;

    // change all the bits to the right of the highest significant bit to 1.
    for (unsigned int i = 1; i <= 16; i *= 2)
    {
        nValue |= (nValue >> i);
    }

    nValue++;

    return nValue;
}


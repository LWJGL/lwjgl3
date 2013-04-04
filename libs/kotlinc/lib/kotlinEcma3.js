var Kotlin = {};
(function() {
  function e(c, d) {
    for(var a in d) {
      d.hasOwnProperty(a) && (c[a] = d[a])
    }
  }
  var g = function() {
  };
  Function.prototype.bind || (Function.prototype.bind = function(c) {
    if("function" !== typeof this) {
      throw new TypeError("Function.prototype.bind - what is trying to be bound is not callable");
    }
    var d = Array.prototype.slice.call(arguments, 1), a = this, b = function() {
    }, f = function() {
      return a.apply(this instanceof b && c ? this : c, d.concat(Array.prototype.slice.call(arguments)))
    };
    b.prototype = this.prototype;
    f.prototype = new b;
    return f
  });
  Kotlin.keys = Object.keys || function(c) {
    var d = [], a = 0, b;
    for(b in c) {
      c.hasOwnProperty(b) && (d[a++] = b)
    }
    return d
  };
  Kotlin.argumentsToArrayLike = function(c) {
    for(var d = c.length, a = Array(d);d--;) {
      a[d] = c[d]
    }
    return a
  };
  Kotlin.isType = function(c, d) {
    if(c === null || c === void 0) {
      return false
    }
    for(var a = c.get_class();a !== d;) {
      if(a === null) {
        return false
      }
      a = a.superclass
    }
    return true
  };
  Kotlin.createTrait = function() {
    return function() {
      for(var c = arguments[0], d = 1, a = arguments.length;d < a;d++) {
        e(c, arguments[d])
      }
      return c
    }
  }();
  Kotlin.definePackage = function(c) {
    return c === null ? {} : c
  };
  Kotlin.createClass = function() {
    function c() {
    }
    function d(a) {
      e(this.prototype, a);
      return this
    }
    return function() {
      function a() {
        this.initializing = a;
        this.initialize && this.initialize.apply(this, arguments)
      }
      var b = null, f = Kotlin.argumentsToArrayLike(arguments);
      typeof f[0] == "function" && (b = f.shift());
      a.addMethods = d;
      a.superclass = b;
      a.subclasses = [];
      if(b) {
        c.prototype = b.prototype;
        a.prototype = new c;
        b.subclasses.push(a)
      }
      a.addMethods({get_class:function() {
        return a
      }});
      b !== null && a.addMethods({super_init:function() {
        this.initializing = this.initializing.superclass;
        this.initializing.prototype.initialize.apply(this, arguments)
      }});
      for(var b = 0, h = f.length;b < h;b++) {
        a.addMethods(f[b])
      }
      if(!a.prototype.initialize) {
        a.prototype.initialize = g
      }
      return a.prototype.constructor = a
    }
  }();
  Kotlin.$createClass = Kotlin.createClass;
  Kotlin.createObjectWithPrototype = function(c) {
    function d() {
    }
    d.prototype = c;
    return new d
  };
  Kotlin.$new = function(c) {
    var d = Kotlin.createObjectWithPrototype(c.prototype);
    return function() {
      c.apply(d, arguments);
      return d
    }
  };
  Kotlin.createObject = function() {
    return new (Kotlin.createClass.apply(null, arguments))
  };
  Kotlin.defineModule = function(c, d) {
    if(c in Kotlin.modules) {
      throw Kotlin.$new(Kotlin.IllegalArgumentException)();
    }
    Kotlin.modules[c] = d
  }
})();
String.prototype.startsWith = function(e) {
  return 0 === this.indexOf(e)
};
String.prototype.endsWith = function(e) {
  return-1 !== this.indexOf(e, this.length - e.length)
};
String.prototype.contains = function(e) {
  return-1 !== this.indexOf(e)
};
var kotlin = {set:function(e, g, c) {
  return e.put(g, c)
}};
(function() {
  function e(a) {
    return function() {
      throw new TypeError(void 0 !== a ? "Function " + a + " is abstract" : "Function is abstract");
    }
  }
  Kotlin.equals = function(a, b) {
    if(null === a || void 0 === a) {
      return null === b
    }
    if(a instanceof Array) {
      if(!(b instanceof Array) || a.length != b.length) {
        return!1
      }
      for(var f = 0;f < a.length;f++) {
        if(!Kotlin.equals(a[f], b[f])) {
          return!1
        }
      }
      return!0
    }
    return"object" == typeof a && void 0 !== a.equals ? a.equals(b) : a === b
  };
  Kotlin.array = function(a) {
    return null === a || void 0 === a ? [] : a.slice()
  };
  Kotlin.intUpto = function(a, b) {
    return Kotlin.$new(Kotlin.NumberRange)(a, b)
  };
  Kotlin.intDownto = function(a, b) {
    return Kotlin.$new(Kotlin.Progression)(a, b, -1)
  };
  Kotlin.modules = {};
  Kotlin.Exception = Kotlin.$createClass();
  Kotlin.RuntimeException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.NullPointerException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.NoSuchElementException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IllegalArgumentException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IllegalStateException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IndexOutOfBoundsException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.UnsupportedOperationException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.IOException = Kotlin.$createClass(Kotlin.Exception);
  Kotlin.throwNPE = function() {
    throw Kotlin.$new(Kotlin.NullPointerException)();
  };
  Kotlin.Iterator = Kotlin.$createClass({initialize:function() {
  }, next:e("Iterator#next"), hasNext:e("Iterator#hasNext")});
  var g = Kotlin.$createClass(Kotlin.Iterator, {initialize:function(a) {
    this.array = a;
    this.size = a.length;
    this.index = 0
  }, next:function() {
    return this.array[this.index++]
  }, get_hasNext:function() {
    return this.index < this.size
  }, hasNext:function() {
    return this.index < this.size
  }}), c = Kotlin.$createClass(g, {initialize:function(a) {
    this.list = a;
    this.size = a.size();
    this.index = 0
  }, next:function() {
    return this.list.get(this.index++)
  }, get_hasNext:function() {
    return this.index < this.size
  }});
  Kotlin.Collection = Kotlin.$createClass();
  Kotlin.AbstractList = Kotlin.$createClass(Kotlin.Collection, {iterator:function() {
    return Kotlin.$new(c)(this)
  }, isEmpty:function() {
    return 0 === this.size()
  }, addAll:function(a) {
    for(var a = a.iterator(), b = this.$size;0 < b--;) {
      this.add(a.next())
    }
  }, remove:function(a) {
    a = this.indexOf(a);
    -1 !== a && this.removeAt(a)
  }, contains:function(a) {
    return-1 !== this.indexOf(a)
  }, equals:function(a) {
    if(this.$size === a.$size) {
      for(var b = this.iterator(), a = a.iterator(), f = this.$size;0 < f--;) {
        if(!Kotlin.equals(b.next(), a.next())) {
          return!1
        }
      }
    }
    return!0
  }, toString:function() {
    for(var a = "[", b = this.iterator(), f = !0, c = this.$size;0 < c--;) {
      f ? f = !1 : a += ", ", a += b.next()
    }
    return a + "]"
  }, toJSON:function() {
    return this.toArray()
  }});
  Kotlin.ArrayList = Kotlin.$createClass(Kotlin.AbstractList, {initialize:function() {
    this.array = [];
    this.$size = 0
  }, get:function(a) {
    this.checkRange(a);
    return this.array[a]
  }, set:function(a, b) {
    this.checkRange(a);
    this.array[a] = b
  }, toArray:function() {
    return this.array.slice(0, this.$size)
  }, size:function() {
    return this.$size
  }, iterator:function() {
    return Kotlin.arrayIterator(this.array)
  }, add:function(a) {
    this.array[this.$size++] = a
  }, addAt:function(a, b) {
    this.array.splice(a, 0, b);
    this.$size++
  }, addAll:function(a) {
    for(var b = a.iterator(), f = this.$size, c = a.size();0 < c--;) {
      this.array[f++] = b.next()
    }
    this.$size += a.size()
  }, removeAt:function(a) {
    this.checkRange(a);
    this.$size--;
    return this.array.splice(a, 1)[0]
  }, clear:function() {
    this.$size = this.array.length = 0
  }, indexOf:function(a) {
    for(var b = 0, f = this.$size;b < f;++b) {
      if(Kotlin.equals(this.array[b], a)) {
        return b
      }
    }
    return-1
  }, toString:function() {
    return"[" + this.array.join(", ") + "]"
  }, toJSON:function() {
    return this.array
  }, checkRange:function(a) {
    if(0 > a || a >= this.$size) {
      throw new Kotlin.IndexOutOfBoundsException;
    }
  }});
  Kotlin.Runnable = Kotlin.$createClass({initialize:function() {
  }, run:e("Runnable#run")});
  Kotlin.Comparable = Kotlin.$createClass({initialize:function() {
  }, compareTo:e("Comparable#compareTo")});
  Kotlin.Appendable = Kotlin.$createClass({initialize:function() {
  }, append:e("Appendable#append")});
  Kotlin.Closeable = Kotlin.$createClass({initialize:function() {
  }, close:e("Closeable#close")});
  Kotlin.parseInt = function(a) {
    return parseInt(a, 10)
  };
  Kotlin.safeParseInt = function(a) {
    a = parseInt(a, 10);
    return isNaN(a) ? null : a
  };
  Kotlin.safeParseDouble = function(a) {
    a = parseFloat(a);
    return isNaN(a) ? null : a
  };
  Kotlin.System = function() {
    var a = "", b = function(b) {
      void 0 !== b && (a = null === b || "object" !== typeof b ? a + b : a + b.toString())
    }, f = function(b) {
      this.print(b);
      a += "\n"
    };
    return{out:function() {
      return{print:b, println:f}
    }, output:function() {
      return a
    }, flush:function() {
      a = ""
    }}
  }();
  Kotlin.println = function(a) {
    Kotlin.System.out().println(a)
  };
  Kotlin.print = function(a) {
    Kotlin.System.out().print(a)
  };
  Kotlin.RangeIterator = Kotlin.$createClass(Kotlin.Iterator, {initialize:function(a, b, f) {
    this.$start = a;
    this.$end = b;
    this.$increment = f;
    this.$i = a
  }, get_start:function() {
    return this.$start
  }, get_end:function() {
    return this.$end
  }, get_i:function() {
    return this.$i
  }, set_i:function(a) {
    this.$i = a
  }, next:function() {
    var a = this.$i;
    this.set_i(this.$i + this.$increment);
    return a
  }, get_hasNext:function() {
    return 0 < this.$increment ? this.$next <= this.$end : this.$next >= this.$end
  }});
  Kotlin.NumberRange = Kotlin.$createClass({initialize:function(a, b) {
    this.$start = a;
    this.$end = b
  }, get_start:function() {
    return this.$start
  }, get_end:function() {
    return this.$end
  }, get_increment:function() {
    return 1
  }, contains:function(a) {
    return this.$start <= a && a <= this.$end
  }, iterator:function() {
    return Kotlin.$new(Kotlin.RangeIterator)(this.get_start(), this.get_end())
  }});
  Kotlin.Progression = Kotlin.$createClass({initialize:function(a, b, f) {
    this.$start = a;
    this.$end = b;
    this.$increment = f
  }, get_start:function() {
    return this.$start
  }, get_end:function() {
    return this.$end
  }, get_increment:function() {
    return this.$increment
  }, iterator:function() {
    return Kotlin.$new(Kotlin.RangeIterator)(this.get_start(), this.get_end(), this.get_increment())
  }});
  Kotlin.Comparator = Kotlin.$createClass({initialize:function() {
  }, compare:e("Comparator#compare")});
  var d = Kotlin.$createClass(Kotlin.Comparator, {initialize:function(a) {
    this.compare = a
  }});
  Kotlin.comparator = function(a) {
    return Kotlin.$new(d)(a)
  };
  Kotlin.collectionsMax = function(a, b) {
    var f = a.iterator();
    if(a.isEmpty()) {
      throw Kotlin.Exception();
    }
    for(var c = f.next();f.get_hasNext();) {
      var d = f.next();
      0 > b.compare(c, d) && (c = d)
    }
    return c
  };
  Kotlin.collectionsSort = function(a, b) {
    var c = void 0;
    void 0 !== b && (c = b.compare.bind(b));
    a instanceof Array && a.sort(c);
    for(var d = [], e = a.iterator();e.hasNext();) {
      d.push(e.next())
    }
    d.sort(c);
    c = 0;
    for(e = d.length;c < e;c++) {
      a.set(c, d[c])
    }
  };
  Kotlin.StringBuilder = Kotlin.$createClass({initialize:function() {
    this.string = ""
  }, append:function(a) {
    this.string += a.toString()
  }, toString:function() {
    return this.string
  }});
  Kotlin.splitString = function(a, b) {
    return a.split(b)
  };
  Kotlin.nullArray = function(a) {
    for(var b = [];0 < a;) {
      b[--a] = null
    }
    return b
  };
  Kotlin.numberArrayOfSize = function(a) {
    return Kotlin.arrayFromFun(a, function() {
      return 0
    })
  };
  Kotlin.charArrayOfSize = function(a) {
    return Kotlin.arrayFromFun(a, function() {
      return"\x00"
    })
  };
  Kotlin.booleanArrayOfSize = function(a) {
    return Kotlin.arrayFromFun(a, function() {
      return!1
    })
  };
  Kotlin.arrayFromFun = function(a, b) {
    for(var c = Array(a), d = 0;d < a;d++) {
      c[d] = b(d)
    }
    return c
  };
  Kotlin.arrayIndices = function(a) {
    return Kotlin.$new(Kotlin.NumberRange)(0, a.length - 1)
  };
  Kotlin.arrayIterator = function(a) {
    return Kotlin.$new(g)(a)
  };
  Kotlin.toString = function(a) {
    return a.toString()
  };
  Kotlin.jsonFromPairs = function(a) {
    for(var b = a.length, c = {};0 < b;) {
      --b, c[a[b][0]] = a[b][1]
    }
    return c
  };
  Kotlin.jsonSet = function(a, b, c) {
    a[b] = c
  };
  Kotlin.jsonGet = function(a, b) {
    return a[b]
  };
  Kotlin.jsonAddProperties = function(a, b) {
    for(var c in b) {
      b.hasOwnProperty(c) && (a[c] = b[c])
    }
    return a
  };
  Kotlin.sure = function(a) {
    return a
  };
  Kotlin.concat = function(a, b) {
    for(var c = Array(a.length + b.length), d = 0, e = a.length;d < e;d++) {
      c[d] = a[d]
    }
    for(var e = b.length, g = 0;g < e;) {
      c[d++] = b[g++]
    }
    return c
  }
})();
Kotlin.assignOwner = function(e, g) {
  e.o = g;
  return e
};
Kotlin.b0 = function(e, g, c) {
  return function() {
    return e.call(null !== g ? g : this, c)
  }
};
Kotlin.b1 = function(e, g, c) {
  return function() {
    return e.apply(null !== g ? g : this, c)
  }
};
Kotlin.b2 = function(e, g, c) {
  return function() {
    return e.apply(null !== g ? g : this, Kotlin.concat(c, arguments))
  }
};
Kotlin.b3 = function(e, g) {
  return function() {
    return e.call(g)
  }
};
Kotlin.b4 = function(e, g) {
  return function() {
    return e.apply(g, Kotlin.argumentsToArrayLike(arguments))
  }
};
(function() {
  function e(a) {
    return"string" == typeof a ? a : typeof a.hashCode == i ? (a = a.hashCode(), "string" == typeof a ? a : e(a)) : typeof a.toString == i ? a.toString() : "" + a
  }
  function g(a, b) {
    return a.equals(b)
  }
  function c(a, b) {
    return typeof b.equals == i ? b.equals(a) : a === b
  }
  function d(a) {
    return function(b) {
      if(null === b) {
        throw Error("null is not a valid " + a);
      }
      if("undefined" == typeof b) {
        throw Error(a + " must not be undefined");
      }
    }
  }
  function a(a, b, c, d) {
    this[0] = a;
    this.entries = [];
    this.addEntry(b, c);
    null !== d && (this.getEqualityFunction = function() {
      return d
    })
  }
  function b(a) {
    return function(b) {
      for(var c = this.entries.length, d, e = this.getEqualityFunction(b);c--;) {
        if(d = this.entries[c], e(b, d[0])) {
          switch(a) {
            case j:
              return!0;
            case o:
              return d;
            case p:
              return[c, d[1]]
          }
        }
      }
      return!1
    }
  }
  function f(a) {
    return function(b) {
      for(var c = b.length, d = 0, e = this.entries.length;d < e;++d) {
        b[c + d] = this.entries[d][a]
      }
    }
  }
  function h(b, c) {
    var d = b[c];
    return d && d instanceof a ? d : null
  }
  var i = "function", n = typeof Array.prototype.splice == i ? function(a, b) {
    a.splice(b, 1)
  } : function(a, b) {
    var c, d, e;
    if(b === a.length - 1) {
      a.length = b
    }else {
      c = a.slice(b + 1);
      a.length = b;
      d = 0;
      for(e = c.length;d < e;++d) {
        a[b + d] = c[d]
      }
    }
  }, k = d("key"), q = d("value"), j = 0, o = 1, p = 2;
  a.prototype = {getEqualityFunction:function(a) {
    return typeof a.equals == i ? g : c
  }, getEntryForKey:b(o), getEntryAndIndexForKey:b(p), removeEntryForKey:function(a) {
    return(a = this.getEntryAndIndexForKey(a)) ? (n(this.entries, a[0]), a[1]) : null
  }, addEntry:function(a, b) {
    this.entries[this.entries.length] = [a, b]
  }, keys:f(0), values:f(1), getEntries:function(a) {
    for(var b = a.length, c = 0, d = this.entries.length;c < d;++c) {
      a[b + c] = this.entries[c].slice(0)
    }
  }, containsKey:b(j), containsValue:function(a) {
    for(var b = this.entries.length;b--;) {
      if(a === this.entries[b][1]) {
        return!0
      }
    }
    return!1
  }};
  var r = function(b, c) {
    var d = this, f = [], g = {}, l = typeof b == i ? b : e, j = typeof c == i ? c : null;
    this.put = function(b, c) {
      k(b);
      q(c);
      var d = l(b), e, i = null;
      (e = h(g, d)) ? (d = e.getEntryForKey(b)) ? (i = d[1], d[1] = c) : e.addEntry(b, c) : (e = new a(d, b, c, j), f[f.length] = e, g[d] = e);
      return i
    };
    this.get = function(a) {
      k(a);
      var b = l(a);
      if(b = h(g, b)) {
        if(a = b.getEntryForKey(a)) {
          return a[1]
        }
      }
      return null
    };
    this.containsKey = function(a) {
      k(a);
      var b = l(a);
      return(b = h(g, b)) ? b.containsKey(a) : !1
    };
    this.containsValue = function(a) {
      q(a);
      for(var b = f.length;b--;) {
        if(f[b].containsValue(a)) {
          return!0
        }
      }
      return!1
    };
    this.clear = function() {
      f.length = 0;
      g = {}
    };
    this.isEmpty = function() {
      return!f.length
    };
    var m = function(a) {
      return function() {
        for(var b = [], c = f.length;c--;) {
          f[c][a](b)
        }
        return b
      }
    };
    this._keys = m("keys");
    this._values = m("values");
    this._entries = m("getEntries");
    this.values = function() {
      for(var a = this._values(), b = a.length, c = Kotlin.$new(Kotlin.ArrayList)();b--;) {
        c.add(a[b])
      }
      return c
    };
    this.remove = function(a) {
      k(a);
      var b = l(a), c = null, d = h(g, b);
      if(d && (c = d.removeEntryForKey(a), null !== c && !d.entries.length)) {
        a: {
          for(a = f.length;a--;) {
            if(d = f[a], b === d[0]) {
              break a
            }
          }
          a = null
        }
        n(f, a);
        delete g[b]
      }
      return c
    };
    this.size = function() {
      for(var a = 0, b = f.length;b--;) {
        a += f[b].entries.length
      }
      return a
    };
    this.each = function(a) {
      for(var b = d._entries(), c = b.length, e;c--;) {
        e = b[c], a(e[0], e[1])
      }
    };
    this.putAll = function(a, b) {
      for(var c = a._entries(), e, f, g, h = c.length, j = typeof b == i;h--;) {
        e = c[h];
        f = e[0];
        e = e[1];
        if(j && (g = d.get(f))) {
          e = b(f, g, e)
        }
        d.put(f, e)
      }
    };
    this.clone = function() {
      var a = new r(b, c);
      a.putAll(d);
      return a
    };
    this.keySet = function() {
      for(var a = Kotlin.$new(Kotlin.HashSet)(), b = this._keys(), c = b.length;c--;) {
        a.add(b[c])
      }
      return a
    }
  };
  Kotlin.HashTable = r
})();
Kotlin.Map = Kotlin.$createClass();
Kotlin.HashMap = Kotlin.$createClass(Kotlin.Map, {initialize:function() {
  Kotlin.HashTable.call(this)
}});
Kotlin.ComplexHashMap = Kotlin.HashMap;
(function() {
  var e = Kotlin.$createClass(Kotlin.Iterator, {initialize:function(c, d) {
    this.map = c;
    this.keys = d;
    this.size = d.length;
    this.index = 0
  }, next:function() {
    return this.map[this.keys[this.index++]]
  }, get_hasNext:function() {
    return this.index < this.size
  }}), g = Kotlin.$createClass(Kotlin.Collection, {initialize:function(c) {
    this.map = c
  }, iterator:function() {
    return Kotlin.$new(e)(this.map.map, Kotlin.keys(this.map.map))
  }, isEmpty:function() {
    return 0 === this.map.$size
  }, contains:function(c) {
    return this.map.containsValue(c)
  }});
  Kotlin.PrimitiveHashMap = Kotlin.$createClass(Kotlin.Map, {initialize:function() {
    this.$size = 0;
    this.map = {}
  }, size:function() {
    return this.$size
  }, isEmpty:function() {
    return 0 === this.$size
  }, containsKey:function(c) {
    return void 0 !== this.map[c]
  }, containsValue:function(c) {
    var d = this.map, a;
    for(a in d) {
      if(d.hasOwnProperty(a) && d[a] === c) {
        return!0
      }
    }
    return!1
  }, get:function(c) {
    return this.map[c]
  }, put:function(c, d) {
    var a = this.map[c];
    this.map[c] = void 0 === d ? null : d;
    void 0 === a && this.$size++;
    return a
  }, remove:function(c) {
    var d = this.map[c];
    void 0 !== d && (delete this.map[c], this.$size--);
    return d
  }, clear:function() {
    this.$size = 0;
    this.map = {}
  }, putAll:function() {
    throw Kotlin.$new(Kotlin.UnsupportedOperationException)();
  }, keySet:function() {
    var c = Kotlin.$new(Kotlin.HashSet)(), d = this.map, a;
    for(a in d) {
      d.hasOwnProperty(a) && c.add(a)
    }
    return c
  }, values:function() {
    return Kotlin.$new(g)(this)
  }, toJSON:function() {
    return this.map
  }})
})();
(function() {
  function e(g, c) {
    var d = new Kotlin.HashTable(g, c);
    this.add = function(a) {
      d.put(a, !0)
    };
    this.addAll = function(a) {
      for(var b = a.length;b--;) {
        d.put(a[b], !0)
      }
    };
    this.values = function() {
      return d._keys()
    };
    this.iterator = function() {
      return Kotlin.arrayIterator(this.values())
    };
    this.remove = function(a) {
      return d.remove(a) ? a : null
    };
    this.contains = function(a) {
      return d.containsKey(a)
    };
    this.clear = function() {
      d.clear()
    };
    this.size = function() {
      return d.size()
    };
    this.isEmpty = function() {
      return d.isEmpty()
    };
    this.clone = function() {
      var a = new e(g, c);
      a.addAll(d.keys());
      return a
    };
    this.equals = function(a) {
      if(null === a || void 0 === a) {
        return!1
      }
      if(this.size() === a.size()) {
        for(var b = this.iterator(), a = a.iterator();;) {
          var c = b.get_hasNext(), d = a.get_hasNext();
          if(c != d) {
            break
          }
          if(d) {
            if(c = b.next(), d = a.next(), !Kotlin.equals(c, d)) {
              break
            }
          }else {
            return!0
          }
        }
      }
      return!1
    };
    this.toString = function() {
      for(var a = "[", b = this.iterator(), c = !0;b.get_hasNext();) {
        c ? c = !1 : a += ", ", a += b.next()
      }
      return a + "]"
    };
    this.intersection = function(a) {
      for(var b = new e(g, c), a = a.values(), f = a.length, h;f--;) {
        h = a[f], d.containsKey(h) && b.add(h)
      }
      return b
    };
    this.union = function(a) {
      for(var b = this.clone(), a = a.values(), c = a.length, e;c--;) {
        e = a[c], d.containsKey(e) || b.add(e)
      }
      return b
    };
    this.isSubsetOf = function(a) {
      for(var b = d.keys(), c = b.length;c--;) {
        if(!a.contains(b[c])) {
          return!1
        }
      }
      return!0
    }
  }
  Kotlin.HashSet = Kotlin.$createClass({initialize:function() {
    e.call(this)
  }})
})();



# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> INSERT  6 : 8  @  6

+ import net.lax1dude.eaglercraft.v1_8.HString;
+ 

> CHANGE  7 : 8  @  7 : 8

~ 		super(HString.format("Error parsing: %s: %s", new Object[] { component, message }));

> CHANGE  3 : 4  @  3 : 4

~ 		super(HString.format("Invalid index %d requested for %s", new Object[] { Integer.valueOf(index), component }));

> CHANGE  3 : 4  @  3 : 4

~ 		super(HString.format("Error while parsing: %s", new Object[] { component }), cause);

> EOF

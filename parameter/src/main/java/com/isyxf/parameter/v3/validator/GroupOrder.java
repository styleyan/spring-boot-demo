package com.isyxf.parameter.v3.validator;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({GroupA.class, GroupB.class, Default.class})
public class GroupOrder {
}

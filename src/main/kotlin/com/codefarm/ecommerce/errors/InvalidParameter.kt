package com.codefarm.ecommerce.errors

class InvalidParameter(param: String): Error("invalid $param")